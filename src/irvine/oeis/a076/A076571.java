package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076571 Binomial triangle based on factorials.
 * @author Sean A. Irvine
 */
public class A076571 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Integers.SINGLETON.sum(0, mM, k -> Binomial.binomial(mM, k).multiply(Functions.FACTORIAL.z(mN - k)));
  }
}
