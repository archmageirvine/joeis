package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069927 Numbers k that divide 2^(k+3) - 1.
 * @author Sean A. Irvine
 */
public class A069927 extends Sequence1 {

  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Z.TWO.modPow(mN.add(3), mN).equals(Z.ONE)) {
        return mN;
      }
    }
  }
}
