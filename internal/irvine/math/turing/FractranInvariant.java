package irvine.math.turing;

import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Checks affine nonhalting certificates for ordered FRACTRAN programs.
 * @author Gregory Morse
 */
public final class FractranInvariant {

  private FractranInvariant() {
  }

  private static final class Row {
    private final BigInteger[] mA;
    private final BigInteger mB;

    private Row(final BigInteger[] a, final BigInteger b) {
      BigInteger divisor = BigInteger.ZERO;
      for (final BigInteger k : a) {
        divisor = divisor.gcd(k);
      }
      if (divisor.compareTo(BigInteger.ONE) <= 0) {
        mA = a;
        mB = b;
      } else {
        mA = new BigInteger[a.length];
        for (int j = 0; j < a.length; ++j) {
          mA[j] = a[j].divide(divisor);
        }
        final BigInteger[] qr = b.divideAndRemainder(divisor);
        mB = qr[1].signum() < 0 ? qr[0].subtract(BigInteger.ONE) : qr[0];
      }
    }

  }

  private static BigInteger dot(final int[] a, final int[] b) {
    BigInteger result = BigInteger.ZERO;
    for (int j = 0; j < a.length; ++j) {
      result = result.add(BigInteger.valueOf(a[j]).multiply(BigInteger.valueOf(b[j])));
    }
    return result;
  }

  private static Row row(final int[] a, final int sign, final BigInteger b) {
    return new Row(Arrays.stream(a).mapToObj(k -> BigInteger.valueOf((long) sign * k)).toArray(BigInteger[]::new), b);
  }

  private static Row atMost(final int width, final int j, final int sign, final long b) {
    return atMost(width, j, sign, BigInteger.valueOf(b));
  }

  private static Row atMost(final int width, final int j, final int sign, final BigInteger b) {
    final BigInteger[] a = new BigInteger[width];
    Arrays.fill(a, BigInteger.ZERO);
    a[j] = BigInteger.valueOf(sign);
    return new Row(a, b);
  }

  // Every eliminated inequality is an exact nonnegative combination of
  // input rows, followed by an integer-valid division by their gcd.
  // Failure to find a contradiction is not a proof of feasibility.
  private static boolean contradicts(final List<Row> source, final int width) {
    return contradicts(source, (1L << width) - 1) || branch(source, width, new int[] {48});
  }

  private static boolean negativeConstant(final List<Row> rows) {
    for (final Row r : rows) {
      if (r.mB.signum() < 0 && Arrays.stream(r.mA).allMatch(k -> k.signum() == 0)) {
        return true;
      }
    }
    return false;
  }

  private static List<Row> project(final List<Row> rows, final int j) {
    final List<Row> up = new ArrayList<>();
    final List<Row> down = new ArrayList<>();
    final List<Row> next = new ArrayList<>();
    for (final Row r : rows) {
      final int sign = r.mA[j].signum();
      (sign > 0 ? up : sign < 0 ? down : next).add(r);
    }
    if ((long) up.size() * down.size() + next.size() > 65536) {
      return null;
    }
    for (final Row u : up) {
      for (final Row d : down) {
        final BigInteger x = d.mA[j].negate();
        final BigInteger y = u.mA[j];
        final BigInteger[] z = new BigInteger[u.mA.length];
        for (int k = 0; k < z.length; ++k) {
          z[k] = u.mA[k].multiply(x).add(d.mA[k].multiply(y));
        }
        next.add(new Row(z, u.mB.multiply(x).add(d.mB.multiply(y))));
      }
    }
    return next;
  }

  private static boolean contradicts(final List<Row> rows, final long live) {
    if (negativeConstant(rows)) {
      return true;
    }
    for (long bits = live; bits != 0; bits &= bits - 1) {
      final int j = Long.numberOfTrailingZeros(bits);
      final List<Row> next = project(rows, j);
      if (next != null && contradicts(next, live & ~(1L << j))) {
        return true;
      }
    }
    return false;
  }

  private static final class Rational implements Comparable<Rational> {
    private final BigInteger mNum;
    private final BigInteger mDen;

    private Rational(final BigInteger n, final BigInteger d) {
      final BigInteger gcd = n.gcd(d).multiply(BigInteger.valueOf(d.signum()));
      mNum = n.divide(gcd);
      mDen = d.divide(gcd);
    }

    private Rational subtract(final Rational r, final BigInteger coefficient) {
      return new Rational(mNum.multiply(r.mDen).subtract(r.mNum.multiply(mDen).multiply(coefficient)), mDen.multiply(r.mDen));
    }

    private BigInteger floor() {
      final BigInteger[] qr = mNum.divideAndRemainder(mDen);
      return qr[1].signum() < 0 ? qr[0].subtract(BigInteger.ONE) : qr[0];
    }

    @Override
    public int compareTo(final Rational r) {
      return mNum.multiply(r.mDen).compareTo(r.mNum.multiply(mDen));
    }
  }

  // Only the contradiction checks prove nonexistence. A fractional point
  // suggests a split into two branches covering every integer point.
  private static boolean branch(final List<Row> rows, final int width, final int[] budget) {
    if (--budget[0] < 0) {
      return false;
    }
    final List<List<Row>> projected = new ArrayList<>();
    projected.add(rows);
    for (int j = 0; j <= width; ++j) {
      final List<Row> r = projected.get(j);
      if (negativeConstant(r)) {
        return true;
      }
      if (j < width) {
        final List<Row> p = project(r, j);
        if (p == null) {
          return false;
        }
        projected.add(p);
      }
    }
    final Rational[] point = new Rational[width];
    for (int j = width - 1; j >= 0; --j) {
      Rational lo = null;
      Rational hi = null;
      for (final Row r : projected.get(j)) {
        final BigInteger c = r.mA[j];
        if (c.signum() != 0) {
          Rational b = new Rational(r.mB, BigInteger.ONE);
          for (int k = j + 1; k < width; ++k) {
            b = b.subtract(point[k], r.mA[k]);
          }
          b = new Rational(b.mNum, b.mDen.multiply(c));
          if (c.signum() < 0 && (lo == null || b.compareTo(lo) > 0)) {
            lo = b;
          }
          if (c.signum() > 0 && (hi == null || b.compareTo(hi) < 0)) {
            hi = b;
          }
        }
      }
      final BigInteger z = hi != null ? hi.floor()
        : lo != null ? lo.floor().add(BigInteger.ONE) : BigInteger.ZERO;
      point[j] = new Rational(z, BigInteger.ONE);
      if (lo != null && lo.compareTo(point[j]) > 0) {
        final List<Row> split = new ArrayList<>(rows);
        split.add(atMost(width, j, 1, z));
        if (!branch(split, width, budget)) {
          return false;
        }
        split.set(split.size() - 1, atMost(width, j, -1, z.add(BigInteger.ONE).negate()));
        return branch(split, width, budget);
      }
    }
    return false;
  }

  private static boolean enabled(final int[][] p, final int[] x) {
    for (final int[] r : p) {
      boolean legal = true;
      for (int j = 0; j < x.length; ++j) {
        legal &= (long) x[j] + r[j] >= 0;
      }
      if (legal) {
        return true;
      }
    }
    return false;
  }

  // Prove impossibility for every way of blocking the indicated rules.
  private static boolean excludes(final List<Row> rows, final int[][] p, final int end, final int i, final int[] displacement) {
    if (i == end) {
      return contradicts(rows, displacement.length);
    }
    for (int j = 0; j < displacement.length; ++j) {
      if (p[i][j] < 0) {
        rows.add(atMost(displacement.length, j, 1, -(long) p[i][j] - 1 - displacement[j]));
        final boolean excluded = excludes(rows, p, end, i + 1, displacement);
        rows.remove(rows.size() - 1);
        if (!excluded) {
          return false;
        }
      }
    }
    return true;
  }

  private static boolean safe(final List<Row> rows, final int[][] p, final int i, final int k, final int[][] a, final int[] b) {
    final int[] move = p[k];
    if (i == k) {
      for (int l = 0; l < b.length; ++l) {
        final BigInteger bound = BigInteger.valueOf((long) b[l] - 1).subtract(dot(a[l], move));
        rows.add(row(a[l], 1, bound));
        final boolean excluded = contradicts(rows, move.length);
        rows.remove(rows.size() - 1);
        if (!excluded) {
          return false;
        }
      }
      return excludes(rows, p, p.length, 0, move);
    }
    for (int j = 0; j < move.length; ++j) {
      if (p[i][j] < 0) {
        rows.add(atMost(move.length, j, 1, -(long) p[i][j] - 1));
        final boolean checked = safe(rows, p, i + 1, k, a, b);
        rows.remove(rows.size() - 1);
        if (!checked) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Check that the program starting at exponent vector (1,0,...) never halts.
   * @param program ordered exponent changes, one row per fraction
   * @param a invariant coefficients, one row per inequality
   * @param b bounds for the inequalities a*x &gt;= b
   * @return true only when all proof obligations close
   */
  public static boolean proves(final int[][] program, final int[][] a, final int[] b) {
    if (program.length == 0 || program[0].length == 0 || a.length != b.length || a.length == 0) {
      return false;
    }
    final int w = program[0].length;
    if (w > 8 || Arrays.stream(program).anyMatch(r -> r.length != w) || Arrays.stream(a).anyMatch(r -> r.length != w)) {
      return false;
    }
    final int[] start = new int[w];
    start[0] = 1;
    if (!enabled(program, start)) {
      return false;
    }
    final List<Row> invariant = new ArrayList<>();
    for (int i = 0; i < b.length; ++i) {
      if (a[i][0] < b[i]) {
        return false;
      }
      invariant.add(row(a[i], -1, BigInteger.valueOf(-(long) b[i])));
    }
    for (int k = 0; k < program.length; ++k) {
      final List<Row> rows = new ArrayList<>(invariant);
      for (int j = 0; j < w; ++j) {
        rows.add(atMost(w, j, -1, Math.min(0, program[k][j])));
      }
      if (!safe(rows, program, 0, k, a, b)) {
        return false;
      }
    }
    return true;
  }

  private static int[] vector(final String s) {
    return Arrays.stream(s.split(",", -1)).mapToInt(Integer::parseInt).toArray();
  }

  private static int[][] matrix(final String s) {
    return Arrays.stream(s.split(";", -1)).map(FractranInvariant::vector).toArray(int[][]::new);
  }

  /**
   * Replay tab-separated rows of exponent changes, invariant coefficients, and bounds.
   * @param args one or more certificate files
   * @throws IOException if a file cannot be read
   */
  public static void main(final String[] args) throws IOException {
    if (args.length == 0) {
      throw new IllegalArgumentException("Expected certificate files");
    }
    final Set<String> programs = new HashSet<>();
    for (final String name : args) {
      int count = 0;
      try (BufferedReader reader = Files.newBufferedReader(Path.of(name))) {
        for (String line; (line = reader.readLine()) != null; ) {
          final String[] fields = line.split("\t", -1);
          if (fields.length != 3) {
            throw new IllegalArgumentException("Bad certificate row: " + line);
          }
          final int[][] rules = matrix(fields[0]);
          if (!programs.add(Arrays.deepToString(rules)) || !proves(rules, matrix(fields[1]), vector(fields[2]))) {
            throw new IllegalArgumentException("Unproved or duplicate program: " + fields[0]);
          }
          ++count;
        }
      }
      if (count == 0) {
        throw new IllegalArgumentException("No certificates: " + name);
      }
      System.out.println("Verified " + count + " certificates: " + name);
    }
  }
}
