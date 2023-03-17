package irvine.oeis.a058;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058161 Number of labeled cyclic groups with a fixed identity.
 * @author Sean A. Irvine
 */
public class A058161 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z res = mF.divide(Euler.phi(++mN));
    mF = mF.multiply(mN);
    return res;
  }
}
