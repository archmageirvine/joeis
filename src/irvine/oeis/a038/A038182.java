package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038182 3-infinitary perfect numbers k: 3-i-sigma(k) = 2*k, where 3-i-sigma = A049418.
 * @author Sean A. Irvine
 */
public class A038182 extends Sequence1 {

  private Z mN = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.INFINITARY_SIGMA1.z(3, mN).equals(mN.multiply2())) {
        return mN;
      }
    }
  }
}
