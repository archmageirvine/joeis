package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023583 Greatest prime divisor of <code>2*prime(n)-1</code>.
 * @author Sean A. Irvine
 */
public class A023583 extends A000040 {

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(super.next().multiply2().subtract(1)).toZArray();
    return p[p.length - 1];
  }
}
