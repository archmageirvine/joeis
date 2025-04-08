package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076515 Numbers k such that 1 + 3^k + 5^k is prime.
 * @author Sean A. Irvine
 */
public class A076515 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (Z.FIVE.pow(++mN).add(Z.THREE.pow(mN)).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
