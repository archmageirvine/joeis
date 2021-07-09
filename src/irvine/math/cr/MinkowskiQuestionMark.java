package irvine.math.cr;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;

/**
 * The Minkowski question mark function.
 * @author Sean A. Irvine
 */
public class MinkowskiQuestionMark extends CR {

  private static final int EXTRA_PRECISION = 2;
  private final CR mX;

  /**
   * Minkowski question mark function.
   * @param x argument
   */
  public MinkowskiQuestionMark(final CR x) {
    mX = x;
  }

  @Override
  protected Z approximate(final int p) {
    // this one actually compute the inverse function!
//    if (p >= 0) {
//      return Z.ZERO;
//    }
//    final int opPrec = EXTRA_PRECISION - p;
//    final Z t = mX.approximate(-opPrec);
//    final int[] rle = new int[opPrec + 1];
//    boolean s = false;
//    int j = 1;
//    for (int k = opPrec; k >= 0; --k) {
//      if (t.testBit(k) == s) {
//        ++rle[j];
//      } else {
//        ++rle[++j];
//        s = !s;
//      }
//    }
//    Q sum = new Q(1, rle[j--]);
//    for (int k = j; k >= 0; --k) {
//      sum = sum.reciprocal().add(rle[k]);
//    }
//    return CR.valueOf(sum).approximate(p);

    if (p >= 0) {
      return Z.ZERO;
    }
    final int opPrec = EXTRA_PRECISION - p;
    final int bitsLim = 3 * IntegerUtils.lg(opPrec);
    final Convergents conv = new Convergents(mX, 1000);
    conv.next();
    Z currentSum = conv.frac().shiftLeft(opPrec);
    int power = -1;
    long k = 0;
    while (conv.hasNext()) {
      conv.next();
      final Z f = conv.frac();
      if (f.bitLength() > bitsLim) {
        break;
      }
      power += f.intValueExact();
      if (power > opPrec) {
        break;
      }
      currentSum = currentSum.signedAdd((++k & 1) == 1, Z.ONE.shiftLeft(opPrec - power));
    }
    return scale(currentSum, -EXTRA_PRECISION);
  }

  /**
   * For testing.
   * @param args number to compute function for
   */
  public static void main(final String[] args) {
    System.out.println(new MinkowskiQuestionMark(CR.valueOf(args[0], 10)).toString(100));
  }
}

