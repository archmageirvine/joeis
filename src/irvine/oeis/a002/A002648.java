package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002648 A variant of the cuban primes: primes p <code>= (x^3 - y^3 )/(x - y)</code> where <code>x = y + 2</code>.
 * @author Sean A. Irvine
 */
public class A002648 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z p = mN.square().multiply(3).add(1);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
