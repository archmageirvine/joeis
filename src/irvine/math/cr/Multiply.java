package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Representation of the product of two constructive reals. Private.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
class Multiply extends CR {

  private CR mOp1;
  private CR mOp2;

  Multiply(final CR x, final CR y) {
    if (x == null || y == null) {
      throw new NullPointerException();
    }
    mOp1 = x;
    mOp2 = y;
  }

  @Override
  protected Z approximate(final int p) {
    final int halfPrec = (p >> 1) - 1;
    int msdOp1 = mOp1.msd(halfPrec);

    if (msdOp1 == Integer.MIN_VALUE) {
      final int msdOp2 = mOp2.msd(halfPrec);
      if (msdOp2 == Integer.MIN_VALUE) {
        // Product is small enough that zero will do as an approximation.
        return Z.ZERO;
      } else {
        // Swap them, so the larger operand (in absolute value) is first.
        final CR tmp;
        tmp = mOp1;
        mOp1 = mOp2;
        mOp2 = tmp;
        msdOp1 = msdOp2;
      }
    } 
    // msdOp1 is valid at this point.
    final int prec2 = p - msdOp1 - 3;   // Precision needed for op2.
    // The appr. error is multiplied by at most 2 ^ (msd_op1 + 1)
    // Thus each approximation contributes 1/4 ulp
    // to the rounding error, and the final rounding adds
    // another 1/2 ulp.
    final Z appr2 = mOp2.getApprox(prec2);
    if (appr2.signum() == 0) {
      return Z.ZERO;
    }
    final int msdOp2 = mOp2.knownMSD();
    final int prec1 = p - msdOp2 - 3; // Precision needed for op1.
    final Z appr1 = mOp1.getApprox(prec1);
    final int scaleDigits =  prec1 + prec2 - p;
    return scale(appr1.multiply(appr2), scaleDigits);
  }
}

