package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023590 Greatest prime divisor of 2*prime(n)+1.
 * @author Sean A. Irvine
 */
public class A023590 extends A000040 {

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(super.next().multiply2().add(1)).toZArray();
    return p[p.length - 1];
  }
}
