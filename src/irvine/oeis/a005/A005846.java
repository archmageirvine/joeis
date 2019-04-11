package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005846 Primes of the form <code>n^2 + n + 41</code>.
 * @author Sean A. Irvine
 */
public class A005846 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z v = mN.square().add(mN).add(41);
      if (v.isProbablePrime()) {
        return v;
      }
    }
  }
}
