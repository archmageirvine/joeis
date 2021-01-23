package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027755 Primes of the form k^2 + k + 5.
 * @author Sean A. Irvine
 */
public class A027755 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().add(mN).add(5);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
