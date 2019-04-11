package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002971 Numbers k such that 4*k^2 <code>+ 25</code> is prime.
 * @author Sean A. Irvine
 */
public class A002971 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.square().multiply(4).add(25).isProbablePrime()) {
        return mN;
      }
    }
  }
}
