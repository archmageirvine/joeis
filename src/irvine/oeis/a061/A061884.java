package irvine.oeis.a061;

import irvine.math.LongUtils;
import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061884 a(n) = Sum_{ d | n } phi(lcm(d,n/d)), where phi(n) = Euler totient A000010.
 * @author Sean A. Irvine
 */
public class A061884 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Euler.phi(LongUtils.lcm(d, mN / d)));
  }
}
