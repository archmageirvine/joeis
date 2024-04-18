package irvine.oeis.a060;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060674 Numbers n such that phi(x) = n has exactly 11 solutions.
 * @author Sean A. Irvine
 */
public class A060674 extends Sequence1 {

  private Z mN = Z.valueOf(46);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (InverseEuler.inversePhi(mN).size() == 11) {
        return mN;
      }
    }
  }
}
