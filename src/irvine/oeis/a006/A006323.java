package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006323.
 * @author Sean A. Irvine
 */
public class A006323 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 2).add(Binomial.binomial(mN + 1, 4).multiply(7));
  }
}

