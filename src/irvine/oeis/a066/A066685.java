package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066685 Numbers n such that p(n) is congruent to EulerPhi(n) mod n, where p(n) denotes the n-th prime.
 * @author Sean A. Irvine
 */
public class A066685 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == Euler.phi(mN).mod(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
