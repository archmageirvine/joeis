package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a007.A007617;

/**
 * A067006 Smallest number for which the totient is divisible by the n-th nontotient number, that is, the n-th term of A007617.
 * @author Sean A. Irvine
 */
public class A067006 extends A007617 {

  @Override
  public Z next() {
    final Z mod = super.next();
    long k = 0;
    while (true) {
      if (Euler.phi(++k).mod(mod).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
