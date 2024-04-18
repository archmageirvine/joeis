package irvine.oeis.a060;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060669 Numbers n such that phi(x) = n has exactly 6 solutions.
 * @author Sean A. Irvine
 */
public class A060669 extends Sequence1 {

  private Z mN = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (InverseEuler.inversePhi(mN).size() == 6) {
        return mN;
      }
    }
  }
}
