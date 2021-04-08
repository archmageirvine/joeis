package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006410 Number of nonseparable rooted toroidal maps with n + 5 edges and n + 1 vertices.
 * @author Sean A. Irvine
 */
public class A006410 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long m = mN + 8;
    return Binomial.binomial(m, mN).multiply(20)
      .add(Binomial.binomial(m, mN - 1).multiply(471))
      .add(Binomial.binomial(m, mN - 2).multiply(2734))
      .add(Binomial.binomial(m, mN - 3).multiply(5388))
      .add(Binomial.binomial(m, mN - 4).multiply(3264));
  }
}
