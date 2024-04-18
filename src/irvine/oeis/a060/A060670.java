package irvine.oeis.a060;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060670 Numbers n such that phi(x) = n has exactly 7 solutions.
 * @author Sean A. Irvine
 */
public class A060670 extends Sequence1 {

  private Z mN = Z.valueOf(30);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (InverseEuler.inversePhi(mN).size() == 7) {
        return mN;
      }
    }
  }
}
