package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007639 Primes of form <code>2n^2 - 2n + 19</code>.
 * @author Sean A. Irvine
 */
public class A007639 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.square().multiply2().subtract(mN.multiply2()).add(19);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}

