package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027862 Primes of the form n^2 + (n+1)^2.
 * @author Sean A. Irvine
 */
public class A027862 implements Sequence {

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
