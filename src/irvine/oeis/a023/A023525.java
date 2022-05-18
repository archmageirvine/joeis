package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A023525 Greatest prime divisor of prime(n)*prime(n-1) + 1.
 * @author Sean A. Irvine
 */
public class A023525 extends A023523 {

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(super.next()).toZArray();
    return p[p.length - 1];
  }
}
