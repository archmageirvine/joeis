package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023505 Least odd prime divisor of <code>prime(n) - 1</code>, or 1 if <code>prime(n) - 1</code> is a power of 2.
 * @author Sean A. Irvine
 */
public class A023505 extends A000040 {

  @Override
  public Z next() {
    final Z[] t = Cheetah.factor(super.next().subtract(1).makeOdd()).toZArray();
    return t.length == 0 ? Z.ONE : t[0];
  }
}
