package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023570 Greatest exponent in prime-power factorization of <code>p(n)-3</code>.
 * @author Sean A. Irvine
 */
public class A023570 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next().subtract(3).abs()).maxExponent());
  }
}
