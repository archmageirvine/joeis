package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006415 Number of nonseparable toroidal tree-rooted maps with n + 3 edges and n + 1 vertices.
 * @author Sean A. Irvine
 */
public class A006415 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long m = mN + 4;
    return Binomial.binomial(m, mN).multiply(4)
      .add(Binomial.binomial(m, mN - 1).multiply(84))
      .add(Binomial.binomial(m, mN - 2).multiply(456))
      .add(Binomial.binomial(m, mN - 3).multiply(996))
      .add(Binomial.binomial(m, mN - 4).multiply(950))
      .add(Binomial.binomial(m, mN - 5).multiply(330));
  }
}
