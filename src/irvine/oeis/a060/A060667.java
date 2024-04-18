package irvine.oeis.a060;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060667 Numbers n such that phi(x) = n has exactly 4 solutions.
 * @author Sean A. Irvine
 */
public class A060667 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (InverseEuler.inversePhi(mN).size() == 4) {
        return mN;
      }
    }
  }
}
