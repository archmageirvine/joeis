package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023509 Greatest prime divisor of <code>prime(n) + 1</code>.
 * @author Sean A. Irvine
 */
public class A023509 extends A000040 {

  @Override
  public Z next() {
    final Z[] t = Cheetah.factor(super.next().add(1)).toZArray();
    return t[t.length - 1];
  }
}
