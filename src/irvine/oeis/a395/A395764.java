package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395764 allocated for Dalton Heilig.
 * @author Sean A. Irvine
 */
public class A395764 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, 2 * ++mN, k -> Z.NEG_ONE.pow(k).multiply(Binomial.binomial(2 * mN, k)).multiply(Functions.FACTORIAL.z(3 * mN - k)));
  }
}
