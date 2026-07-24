package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395813 Number of perfect matchings in the complete 4-partite graph K_{n,n,n,n}.
 * @author Sean A. Irvine
 */
public class A395813 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Binomial.binomial(mN, k).square().multiply(Functions.FACTORIAL.z(k)).square().multiply(Functions.FACTORIAL.z(2 * mN - 2 * k)));
  }
}

