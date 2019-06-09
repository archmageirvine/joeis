package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023590 Greatest prime divisor of <code>2*p(n)+1</code>.
 * @author Sean A. Irvine
 */
public class A023590 extends A000040 {

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(super.next().multiply2().add(1)).toZArray();
    return p[p.length - 1];
  }
}
