package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014015 Denominators of sign-alternating Egyptian fraction expansion of e - 2.
 * @author Sean A. Irvine
 */
public class A014015 extends Sequence0 {

  // Alternating Egyptian expansion

  private CR mEgyptian = CR.E.subtract(CR.TWO);
  private boolean mSide = false;

  @Override
  public Z next() {
    mSide = !mSide;
    final Z s = mSide ? mEgyptian.inverse().floor() : mEgyptian.inverse().ceil();
    mEgyptian = mEgyptian.subtract(CR.valueOf(s).inverse());
    return s.abs();
  }
}
