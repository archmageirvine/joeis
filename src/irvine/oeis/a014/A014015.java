package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014015 Denominators of sign-alternating Egyptian fraction expansion of <code>e-2</code>.
 * @author Sean A. Irvine
 */
public class A014015 implements Sequence {

  // Alternating Egyptian expansion

  private CR mEgyptian = CR.E.subtract(CR.TWO);
  private boolean mSide = false;

  @Override
  public Z next() {
    mSide = !mSide;
    final Z s = mSide ? mEgyptian.inverse().floor(32) : mEgyptian.inverse().ceil(32);
    mEgyptian = mEgyptian.subtract(CR.valueOf(s).inverse());
    return s.abs();
  }
}
