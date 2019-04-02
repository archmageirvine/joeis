package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a006.A006384;
import irvine.oeis.a006.A006849;

/**
 * A054935 Number of planar maps with n edges up to orientation-preserving duality.
 * @author Sean A. Irvine
 */
public class A054935 extends A006384 {

  private final A006849 mSeq = new A006849();
  private boolean mAlt = true;

  {
    super.next();
  }

  @Override
  public Z next() {
    mAlt = !mAlt;
    return super.next().add(mAlt ? mSeq.next() : Z.ZERO).divide(2);
  }
}
