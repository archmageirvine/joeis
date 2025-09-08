package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080149 Numbers k such that k^2 + 1 and k^2 + 3 are both prime.
 * @author Sean A. Irvine
 */
public class A080149 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z k2 = Z.valueOf(++mN).square();
      if (k2.add(1).isProbablePrime() && k2.add(3).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
