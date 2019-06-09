package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023568 Number of distinct prime divisors of <code>prime(n)-3</code>.
 * @author Sean A. Irvine
 */
public class A023568 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Cheetah.factor(super.next().subtract(3).abs()).omega());
  }
}
