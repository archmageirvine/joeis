package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076513 Numbers k such that 2 + 2^k + 3^k is prime.
 * @author Sean A. Irvine
 */
public class A076513 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.THREE.pow(++mN).add(Z.TWO.pow(mN)).add(2).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
