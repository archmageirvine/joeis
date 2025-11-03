package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081507 Numbers k for which 2^k + 3^k + 4^k is prime.
 * @author Sean A. Irvine
 */
public class A081507 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.ONE.shiftLeft(2L * ++mN).setBit(mN).add(Z.THREE.pow(mN));
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
