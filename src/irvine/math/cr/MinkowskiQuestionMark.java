package irvine.math.cr;

import irvine.math.z.Z;

/**
 * The Minkowski question mark function.
 * @author Sean A. Irvine
 */
public class MinkowskiQuestionMark extends CR {

  private static final int EXTRA_PRECISION = 5;
  private final CR mX;

  /**
   * Minkowski question mark function.
   * @param x argument
   */
  public MinkowskiQuestionMark(final CR x) {
    mX = x;
  }

  @Override
  protected Z approximate(final int prec) {
    if (prec >= 0) {
      return Z.ZERO;
    }
    final int opPrec = EXTRA_PRECISION - prec;
    final Z x = mX.approximate(-opPrec);
    Z p = mX.floor();
    Z r = p.add(1);
    Z q = Z.ONE;
    Z s = Z.ONE;
    Z d = Z.ONE.shiftLeft(opPrec);
    Z y = p.shiftLeft(opPrec);

    for (int k = 0; k <= opPrec; ++k) {
      d = d.divide2();
      final Z m = p.add(r);
      final Z n = q.add(s);
      if (x.multiply(n).compareTo(m.shiftLeft(opPrec)) < 0) {
        r = m;
        s = n;
      } else {
        y = y.add(d);
        p = m;
        q = n;
      }
    }
    return y.add(d).shiftRight(EXTRA_PRECISION);
  }

  /**
   * For testing.
   * @param args number to compute function for
   */
  public static void main(final String[] args) {
    System.out.println(new MinkowskiQuestionMark(CR.valueOf(args[0], 10)).toString(100));
  }
}

