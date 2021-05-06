package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023576 Greatest prime divisor of prime(n)+3.
 * @author Sean A. Irvine
 */
public class A023576 extends A000040 {

  @Override
  public Z next() {
    final Z[] p = Cheetah.factor(super.next().add(3)).toZArray();
    return p[p.length - 1];
  }
}
