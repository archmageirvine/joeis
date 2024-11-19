package irvine.oeis.a060;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060675 Numbers k such that phi(x) = k has exactly 12 solutions.
 * @author Sean A. Irvine
 */
public class A060675 extends Sequence1 {

  private Z mN = Z.valueOf(158);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (InverseEuler.inversePhi(mN).size() == 12) {
        return mN;
      }
    }
  }
}
