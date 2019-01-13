package irvine.math.cr;

import irvine.math.z.Z;

/**
 * A specialization of CR for cases in which approximate() calls
 * to increase evaluation precision are somewhat expensive.
 * If we need to (re)evaluate, we speculatively evaluate to slightly
 * higher precision, minimizing reevaluations.
 * Note that this requires any arguments to be evaluated to higher
 * precision than absolutely necessary.  It can thus potentially
 * result in lots of wasted effort, and should be used judiciously.
 * This assumes that the order of magnitude of the number is roughly one.
 * @author Hans.Boehm@hp.com
 * @author Sean A. Irvine
 */
abstract class SlowCR extends CR {

  private static final int MAX_PREC = -64;
  private static final int PREC_INCR = 32;

  @Override
  public Z getApprox(final int precision) {
    checkPrecision(precision);
    if (mApprValid && precision >= mMinPrec) {
      return scale(mMaxAppr, mMinPrec - precision);
    } else {
      final int evalPrec = precision >= MAX_PREC ? MAX_PREC : (precision - PREC_INCR + 1) & ~(PREC_INCR - 1);
      final Z result = approximate(evalPrec);
      mMinPrec = evalPrec;
      mMaxAppr = result;
      mApprValid = true;
      return scale(result, evalPrec - precision);   
    }
  }
}


