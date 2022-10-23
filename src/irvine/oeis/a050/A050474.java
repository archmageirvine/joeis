package irvine.oeis.a050;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050474 Solutions to 2*phi(x) = x+1.
 * @author Sean A. Irvine
 */
public class A050474 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.phi(mN).multiply2().equals(mN.add(1))) {
        return mN;
      }
    }
  }
}
