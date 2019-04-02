package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001689 5th forward differences of factorial numbers A000142.
 * @author Sean A. Irvine
 */
public class A001689 implements Sequence {

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Z m = Z.valueOf(mN).add(10).multiply(mN).add(45).multiply(mN).add(100).multiply(mN).add(109).multiply(mN).add(44);
    return mF.multiply(m);
  }
}
