package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027864 Primes of the form k^2 + (k+1)^2 + (k+2)^2.
 * @author Sean A. Irvine
 */
public class A027864 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().add(mN.add(1).square()).add(mN.add(2).square());
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
