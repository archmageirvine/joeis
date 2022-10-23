package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A006408 Number of nonseparable rooted toroidal maps with n + 3 edges and n + 1 vertices.
 * @author Sean A. Irvine
 */
public class A006408 extends Sequence2 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long m = mN + 4;
    return Binomial.binomial(m, mN).multiply(4)
      .add(Binomial.binomial(m, mN - 1).multiply(19))
      .add(Binomial.binomial(m, mN - 2).multiply(16));
  }
}
