package irvine.oeis.a063;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063668 Numbers of the form 12*k + 2 with nonempty inverse totient set.
 * @author Sean A. Irvine
 */
public class A063668 extends Sequence1 {

  private Z mN = Z.valueOf(-10);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(12);
      if (!InverseEuler.inversePhi(mN).isEmpty()) {
        return mN;
      }
    }
  }
}
