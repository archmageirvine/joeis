package irvine.oeis.a117;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A117388 a(n) is the smallest n-digit integer such that, if all numbers formed by inserting the exponentiation symbol between any two digits are added up, the sum is prime.
 * @author Sean A. Irvine
 */
public class A117388 implements Sequence {

  private int mN = 0;

  private final HashMap<String, Z> mCache = new HashMap<>();

  private Z exp(final String s, final int pos) {
    final String left = s.substring(0, pos);
    final String right = s.substring(pos);
    final String key = left + "^" + right;
    final Z r = mCache.get(key);
    if (r != null) {
      return r;
    }
    final Z x = new Z(left).pow(Integer.parseInt(right));
    mCache.put(key, x);
    return x;
  }

  private boolean parityTest(final String s) {
    int oddCount = 0;
    for (int k = 0; k < s.length() - 1; ++k) {
      final char c = s.charAt(k);
      if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
        ++oddCount;
      }
    }
    return (oddCount & 1) == 1;
  }

  private void dumpCandidate(final PrintStream ps, final String s) {
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k < s.length(); ++k) {
      if (sb.length() != 0) {
        sb.append('+');
      }
      sb.append(s.substring(0, k))
        .append('^')
        .append(s.substring(k));
    }
    ps.println(sb);
  }

  private boolean test(final long c, final PrintStream ps) {
    final String s = String.valueOf(c);
    if (!s.contains("0") && parityTest(s)) {
      if (ps != null) {
        dumpCandidate(ps, s);
      } else {
        Z sum = Z.ZERO;
        for (int k = 1; k < s.length(); ++k) {
          sum = sum.add(exp(s, k));
        }
        return sum.isProbablePrime(10);
      }
    }
    return false;
  }

  private Z findIt(final int n, final String output) throws IOException {
    if (n == 1) {
      // This is the only exception to the parity rule
      return Z.valueOf(21);
    }
    try (final PrintStream os = output == null ? null : new PrintStream(new BufferedOutputStream(new FileOutputStream(output)))) {
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k <= n; ++k) {
        sb.append('1');
      }
      long c = Long.parseLong(sb.toString());
      long lim = 10;
      while (lim < c) {
        lim *= 10;
      }
      while (c < lim) {
        if (test(c, os)) {
          return Z.valueOf(c);
        }
        ++c;
      }
      return null;
    }
  }

  @Override
  public Z next() {
    try {
      return findIt(++mN, null);
    } catch (final IOException e) {
      // This cannot happen
      throw new RuntimeException(e);
    }
  }

  /**
   * Try and find the solution for a particular position of this sequence, with
   * optional ability to write a file containing the candidates (useful to
   * apply an external primality testing tool).
   *
   * @param args position in sequence and output file
   * @exception Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    if (args == null || args.length == 0) {
      System.err.println("Usage: A117388 length [candidates-output-file]");
      return;
    }
    final A117388 s = new A117388();
    final int n = Integer.parseInt(args[0]);
    final String name = args.length == 1 ? null : args[1];
    System.out.println(s.findIt(n - 1, name));
  }
}

