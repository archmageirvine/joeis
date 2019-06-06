package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;

/**
 * A023519 Least odd prime divisor of <code>p(n)*p(n-1) - 1</code>, or 1 if <code>p(n)*p(n-1) - 1</code> is a power of 2.
 * @author Sean A. Irvine
 */
public class A023519 extends A023515 {

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(super.next().makeOdd()).toZArray();
    return p.length == 0 ? Z.ONE : p[0];
  }
}
