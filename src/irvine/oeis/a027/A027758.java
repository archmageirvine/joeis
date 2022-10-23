package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027758 Primes of the form k^2 + k + 9.
 * @author Sean A. Irvine
 */
public class A027758 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().add(mN).add(9);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
