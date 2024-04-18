package irvine.oeis.a043;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A043343 Numbers n such that there is no k &gt; n such that phi(k) = phi(n), where phi is Euler's totient function.
 * @author Sean A. Irvine
 */
public class A043343 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (InverseEuler.inversePhi(Functions.PHI.z(mN)).last().equals(mN)) {
        return mN;
      }
    }
  }
}
