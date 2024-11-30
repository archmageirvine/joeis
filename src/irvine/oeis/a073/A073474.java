package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073451.
 * @author Sean A. Irvine
 */
public class A073474 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mN, k -> Binomial.binomial(k, mM).multiply(Functions.FALLING_FACTORIAL.z(mN, k)));
  }
}
