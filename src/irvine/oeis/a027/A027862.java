package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027862 Primes of the form j^2 + (j+1)^2.
 * @author Sean A. Irvine
 */
public class A027862 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().add(mN.add(1).square());
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
