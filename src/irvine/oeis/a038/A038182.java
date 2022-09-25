package irvine.oeis.a038;

import irvine.math.z.InfinitaryDivisors;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038182 3-infinitary perfect numbers k: 3-i-sigma(k) = 2*k, where 3-i-sigma = A049418.
 * @author Sean A. Irvine
 */
public class A038182 implements Sequence {

  private Z mN = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (InfinitaryDivisors.infinitary3Sigma(mN).equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
