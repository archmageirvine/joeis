package irvine.oeis.a043;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A043343 Numbers n such that there is no k &gt; n such that phi(k) = phi(n), where phi is Euler's totient function.
 * @author Sean A. Irvine
 */
public class A043343 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.inversePhi(Euler.phi(mN)).last().equals(mN)) {
        return mN;
      }
    }
  }
}
