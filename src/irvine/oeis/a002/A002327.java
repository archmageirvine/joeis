package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002327 Primes of the form k^2 - k - 1.
 * @author Sean A. Irvine
 */
public class A002327 extends Sequence1 {

  protected Z mN = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().subtract(mN).subtract(1);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
