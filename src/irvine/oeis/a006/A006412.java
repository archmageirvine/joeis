package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006412 Number of nonseparable tree-rooted planar maps with n + 3 edges and 4 vertices.
 * @author Sean A. Irvine
 */
public class A006412 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long m = mN + 4;
    return Binomial.binomial(m, mN - 1).multiply(4)
      .add(Binomial.binomial(m, mN - 2).multiply(51))
      .add(Binomial.binomial(m, mN - 3).multiply(163))
      .add(Binomial.binomial(m, mN - 4).multiply(194))
      .add(Binomial.binomial(m, mN - 5).multiply(78));
  }
}
