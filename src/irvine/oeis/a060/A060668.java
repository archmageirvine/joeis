package irvine.oeis.a060;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060668 Numbers n such that phi(x) = n has exactly 5 solutions.
 * @author Sean A. Irvine
 */
public class A060668 extends Sequence1 {

  private Z mN = Z.SIX;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (Euler.inversePhi(mN).size() == 5) {
        return mN;
      }
    }
  }
}
