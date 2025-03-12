package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075773.
 * @author Sean A. Irvine
 */
public class A075899 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.THREE.pow(++mN).add(mN * mN);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
