package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058010.
 * @author Sean A. Irvine
 */
public class A058014 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> Binomial.binomial(mN, k).multiply(Z.valueOf(mN + 1 - 2L * k).pow(mN - 1))).shiftRight(mN);
  }
}
