package irvine.oeis.a007;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007367 Numbers k such that phi(x) = k has exactly 3 solutions.
 * @author Sean A. Irvine
 */
public class A007367 implements Sequence {

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
