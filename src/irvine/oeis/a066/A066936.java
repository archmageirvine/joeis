package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066936 Integers k such that prime(k)-1 == 0 (mod phi(k)) where prime(n)=A000040(n) is the n-th prime and phi(n)=A000010(n) is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A066936 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().subtract(1).mod(Euler.phi(++mN)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
