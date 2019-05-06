package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014013 Alternating Egyptian fraction expansion of <code>Pi-3</code>.
 * @author Sean A. Irvine
 */
public class A014013 implements Sequence {

  // Alternating Egyptian expansion

  private CR mEgyptian = CR.PI.subtract(CR.THREE);
  private boolean mSide = false;

  @Override
  public Z next() {
    mSide = !mSide;
    final Z s = mSide ? mEgyptian.inverse().floor() : mEgyptian.inverse().ceil();
    mEgyptian = mEgyptian.subtract(CR.valueOf(s).inverse());
    return s.abs();
  }
}
