package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072804 n-th prime prime(n) written in base (prime(n) (mod 4)).
 * @author Sean A. Irvine
 */
public class A072804 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return new Z(p.toString((int) p.mod(4)));
  }
}
