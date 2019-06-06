package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A023525 Greatest prime divisor of <code>prime(n)*prime(n-1) + 1</code>.
 * @author Sean A. Irvine
 */
public class A023525 extends A023523 {

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(super.next()).toZArray();
    return p[p.length - 1];
  }
}
