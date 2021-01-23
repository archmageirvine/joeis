package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023571 Least odd prime divisor of p(n)-3, or 1 if p(n)-3 is a power of 2.
 * @author Sean A. Irvine
 */
public class A023571 extends A000040 {

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(super.next().subtract(3).abs().makeOdd()).toZArray();
    return p.length == 0 ? Z.ONE : p[0];
  }
}
