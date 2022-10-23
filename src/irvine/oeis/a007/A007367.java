package irvine.oeis.a007;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007367 Numbers k such that phi(x) = k has exactly 3 solutions.
 * @author Sean A. Irvine
 */
public class A007367 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Euler.inversePhi(mN).size() == 3) {
        return mN;
      }
    }
  }
}
