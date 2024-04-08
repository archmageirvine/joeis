package irvine.oeis.a070;

import java.util.function.Function;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A070080 Smallest side of integer triangles [a(n) &lt;= A070081(n) &lt;= A070082(n)], sorted by perimeter, lexicographically ordered.
 * This is the superclass for a set of sequences related to integer-sided triangles.
 * The triangles are generated:
 * <ul>
 * <li>with increasing perimeters p</li>
 * <li>with increasing smallest side a (bottom)</li>
 * <li>with increasing middle side b >= a (left)</li>
 * <li>with right side c = p - a - b <= b</li>
 * </ul>
 * <pre>
 *     |\    ->   /|
 *    b| \ c     / |
 *     |  \     /  |
 *     +---+   +---+
 *       a
 * </pre>
 * The top corner is moved from left to right with (++b, --c).
 * @author Georg Fischer
 */
public class A070080 extends AbstractSequence {

  private long mN;
  private final int mMode; // mode of operation, type of the target terms, one of the following:
  protected static final int COUNT = 0; // count occurrences of condition for the triangles with perimeter n
  protected static final int INDEX = 1; // select indexes in arrays [A070080,A070081,A070082]
  protected static final int SIDE_A = 2;
  protected static final int SIDE_B = 3;
  protected static final int SIDE_C = 4;
  protected static final int PERIMETER = 5; // a + b + c
  protected static final int GCD = 6;
  protected static final int SHAPE = 7; // a^2 + b^2 - c^2
  protected static final int AREA = 8;
  protected static final int INRAD = 9;
  protected static final int SQUARE16 = 10;

  protected long mA; // length of side a
  protected long mB; // length of side b
  protected long mC; // length of side c
  protected long mPeri; // perimeter = a + b + c
  protected Function<Long[], Boolean> mCond; // condition for all triangle(s)

  /** Construct the sequence. */
  public A070080() {
    this(1, SIDE_A, s -> isTriangle(s));
  }

  /**
   * Generic constructor with mode.
   * Parameter <code>cond</code> cannot be omitted for the modes <code>COND_N</code> and <code>FILTER</code>.
   * @param offset first index
   * @param mode of operation, type of the target terms
   */
  public A070080(final int offset, final int mode) {
    this(offset, mode, s -> isTriangle(s));
  }

  /**
   * Generic constructor with mode and condition.
   * @param offset first index
   * @param mode of operation, type of the target terms
   * @param cond bitmask for the condition for the selection of triangles
   */
  public A070080(final int offset, final int mode, final Function<Long[], Boolean> cond) {
    super(offset);
    mN = offset - 1;
    mMode = mode;
    mCond = cond;
    mPeri = 1;
    mA = 1;
    mB = 0;
  }

  /**
   * Generate the next triangle.
   */
  protected void advance() {
    boolean busy = true;
    while (busy) {
      ++mB;
      mC = mPeri - mA - mB;
      // print sprintf("%3d: %3d %3d %3d P\n", mPeri, mA, mB, mC);
      if (mA <= mB && mB <= mC && mA + mB > mC) {
        busy = false;
      } else if (mB > mC) {
        ++mA;
        mB = mA;
        mC = mPeri - mA - mB;
        // print sprintf("%3d: %3d %3d %3d Q\n", mPeri, mA, mB, mC);
        if (mA <= mB && mB <= mC && mA + mB > mC) {
          busy = false;
        } else if (mB + mC <= mA) {
          mPeri++;
          mA = 1;
          mB = mA;
          mC = mPeri - mA - mB;
          // print sprintf("%3d: %3d %3d %3d R\n", mPeri, mA, mB, mC);
          if (mA <= mB && mB <= mC && mA + mB > mC) {
            busy = false;
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    if (mMode == COUNT) {
      ++mN;
      if (mN < 3) { // 1,1,1 with mPeri=3 is the minimal triangle
        return Z.ZERO;
      }
      mPeri = mN;
      mA = 1;
      mB = 0;
      advance();
      long sum = 0;
      while (mPeri == mN) {
        if (evaluate(new Long[] {mA, mB, mC})) {
          ++sum;
        }
        advance();
      }
      return Z.valueOf(sum);
    } else if (mMode == INDEX) {
      while (true) {
        ++mN;
        advance();
        if (evaluate(new Long[] {mA, mB, mC})) {
          return Z.valueOf(mN);
        }
      }
    } else {
      while (true) {
        ++mN;
        advance();
        if (evaluate(new Long[] {mA, mB, mC})) {
          switch (mMode) {
            case SIDE_A:
              return Z.valueOf(mA);
            case SIDE_B:
              return Z.valueOf(mB);
            case SIDE_C:
              return Z.valueOf(mC);
            case PERIMETER:
              return Z.valueOf(mPeri);
            case GCD:
              return Z.valueOf(LongUtils.gcd(mA, mB, mC));
            case SHAPE:
              return Z.valueOf(mA * mA + mB * mB - mC * mC);
            case AREA:
              return Z.valueOf(Math.round(getArea(new Long[] {mA, mB, mC})));
            case INRAD:
              return Z.valueOf(Math.round(getInRadius(new Long[] {mA, mB, mC})));
            case SQUARE16:
              return getSquare16(new Long[] {mA, mB, mC});
            default:
              throw new RuntimeException("Unknown mode: " + mMode);
          }
        }
      }
    }
  }

  /**
   * Compute 16*area^2
   * @return <code>p*(p - 2*a)*(p - 2*b)*(p - 2*c)</code>
   */
  protected static Z getSquare16(final Long[] s) {
    final long a = s[0].longValue();
    final long b = s[1].longValue();
    final long c = s[2].longValue();
    return Z.valueOf(a + b + c).multiply(-a + b + c).multiply(a - b + c).multiply(a + b - c); // (u+v+w)*(-u+v+w)*(u-v+w)*(u+v-w)
  }

  /**
   * Compute the area as a double.
   * @return <code>p*(p - 2*a)*(p - 2*b)*(p - 2*c)</code>
   */
  protected static double getArea(final Long[] s) {
    final double p2 = (s[0] + s[1] + s[2]) / 2.0;
    return Math.sqrt((p2 - s[0]) * (p2 - s[1]) * (p2 - s[2]) * p2);
  }

  /**
   * Compute the inradius as a double.
   * @return <code>p*(p - 2*a)*(p - 2*b)*(p - 2*c)</code>
   */
  protected static double getInRadius(final Long[] s) {
    final double p2 = (s[0] + s[1] + s[2]) / 2.0;
    return Math.sqrt((p2 - s[0]) * (p2 - s[1]) * (p2 - s[2]) / p2);
  }

  /**
   * Evaluate the condition.
   * @param s array for sides a, b, c
   * @return true if the conditions are all fulfilled.
   */
  protected boolean evaluate(final Long[] s) {
    return mCond.apply(s);
  }

  protected static boolean hasCoPrimeSides(final Long[] s) {
    final long a = s[0].longValue();
    final long b = s[1].longValue();
    final long c = s[2].longValue();
    return LongUtils.gcd(a, b, c) == 1;
  }

  protected static boolean hasIntArea(final Long[] s) {
    return getArea(s) % 1 == 0;
  }

  protected static boolean hasIntInRadius(final Long[] s) {
    return getInRadius(s) % 1 == 0;
  }

  protected static boolean hasTrigonalArea(final Long[] s) {
    final double area = getArea(s);
    if (area % 1 == 0) {
      return ZUtils.isTriangular(Z.valueOf((long) area));
    } else {
      return false;
    }
  }

  protected static boolean hasPrimeSides(final Long[] s) {
    return Z.valueOf(s[0]).isProbablePrime()
      && Z.valueOf(s[1]).isProbablePrime()
      && Z.valueOf(s[2]).isProbablePrime();
  }

  protected static boolean isAcute(final Long[] s) {
    return s[0] * s[0] + s[1] * s[1] > s[2] * s[2];
  }

  protected static boolean isHeronian(final Long[] s) {
    final long a = s[0].longValue();
    final long b = s[1].longValue();
    final long c = s[2].longValue();
    final long p = a + b + c;
    final long heron16 = (p - 2 * a) * (p - 2 * b) * (p - 2 * c) * p * 2;
    return heron16 > 0 && Z.valueOf(heron16).isSquare();
  }

  protected static boolean isIsosceles(final Long[] s) {
    final long a = s[0].longValue();
    final long b = s[1].longValue();
    final long c = s[2].longValue();
    return a == b || b == c;
  }

  protected static boolean isObtuse(final Long[] s) {
    return s[0] * s[0] + s[1] * s[1] < s[2] * s[2];
  }

  protected static boolean isRight(final Long[] s) {
    return s[0] * s[0] + s[1] * s[1] == s[2] * s[2];
  }

  protected static boolean isScalene(final Long[] s) {
    final long a = s[0].longValue();
    final long b = s[1].longValue();
    final long c = s[2].longValue();
    return a < b && b < c;
  }

  protected static boolean isTriangle(final Long[] s) {
    return true; // default condition, always true when advance() has been called
  }

  /**
   * Test method: print Zumkeller&apos; list for a range of perimeters
   * @param args command line arguments:
   * <ul>
   * <li>-d debugging mode: 0=none (default), 1=some, 2=more</li>
   * <li>-s first perimeter</li>
   * <li>-e last perimeter</li>
   * </ul>
   */
  public static void main(final String[] args) {
    int debug = 0;
    int periStart = 1;
    int periEnd = 50;
    int iarg = 0;
    while (iarg < args.length) {
      final String opt = args[iarg++];
      try {
        if (false) {
        } else if ("-d".equals(opt)) {
          debug = Integer.parseInt(args[iarg++]);
        } else if ("-s".equals(opt)) {
          periStart = Integer.parseInt(args[iarg++]);
        } else if ("-e".equals(opt)) {
          periEnd = Integer.parseInt(args[iarg++]);
        } else {
          System.err.println("invalid option " + opt);
        }
      } catch (final NumberFormatException exc) {
        // ignored
      }
    }
    new A070080().printList(periStart, periEnd);
  }

  private void printSeparator() {
    System.out.println("+-------+-------+-------------+-------+-------+-----------+");
  }

  private void printList(final long periStart, final long periEnd) {
    mPeri = periStart;
    long oldPeri = mPeri;
    mA = 1;
    mB = 0;
    int n = 0;
    while (mPeri <= periEnd) {
      ++n;
      advance();
      if (mPeri != oldPeri) {
        printSeparator();
        oldPeri = mPeri;
      }
      if (mPeri <= periEnd) {
        final StringBuilder sb = new StringBuilder(128);
        final Long[] s = {mA, mB, mC};
        sb.append(String.format("| %5d | %5d |%4d%4d%4d |", n, mPeri, mA, mB, mC));
        sb.append(String.format("%6d |%6d |", LongUtils.gcd(mA, mB, mC), mA * mA + mB * mB - mC * mC));
        final String h = String.format("%12.6f", getArea(s)).replace(',', '.');
        final String i = String.format("%8.6f", getInRadius(s)).replace(',', '.');
        if (isScalene(s)) {
          sb.append(" s");
        }
        if (isIsosceles(s)) {
          sb.append(" i");
        }
        if (hasPrimeSides(s)) {
          sb.append(" p");
        } else if (hasCoPrimeSides(s)) {
          sb.append(" r");
        } else {
          sb.append("  ");
        }

        if (isAcute(s)) {
          sb.append(" A");
        } else if (isRight(s)) {
          sb.append(" R");
        } else if (isObtuse(s)) {
          sb.append(" O");
        } else {
          sb.append("  ");
        }
        sb.append(hasIntArea(s) ? " H" : "  ");
        sb.append(hasIntInRadius(s) ? " I" : "  ");
        sb.append(" | " + h + " " + i);
        System.out.println(sb);
      }
    }
  }
}
