package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023578 Least odd prime divisor of prime(n)+3, or 1 if prime(n)+3 is a power of 2.
 * @author Sean A. Irvine
 */
public class A023578 extends A000040 {

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(super.next().add(3).makeOdd()).toZArray();
    return p.length == 0 ? Z.ONE : p[0];
  }
}
