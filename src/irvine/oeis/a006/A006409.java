package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006409.
 * @author Sean A. Irvine
 */
public class A006409 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long m = mN + 6;
    return Binomial.binomial(m, mN).multiply(10)
      .add(Binomial.binomial(m, mN - 1).multiply(120))
      .add(Binomial.binomial(m, mN - 2).multiply(328))
      .add(Binomial.binomial(m, mN - 3).multiply(232));
  }
}
