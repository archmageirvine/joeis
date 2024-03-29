package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023509 Greatest prime divisor of prime(n) + 1.
 * @author Sean A. Irvine
 */
public class A023509 extends A000040 {

  @Override
  public Z next() {
    final Z[] t = Jaguar.factor(super.next().add(1)).toZArray();
    return t[t.length - 1];
  }
}
