package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006413 Nonseparable planar tree-rooted maps with <code>n + 4</code> edges and 5 vertices.
 * @author Sean A. Irvine
 */
public class A006413 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long m = mN + 6;
    return Binomial.binomial(m, mN - 1).multiply(5)
      .add(Binomial.binomial(m, mN - 2).multiply(170))
      .add(Binomial.binomial(m, mN - 3).multiply(1440))
      .add(Binomial.binomial(m, mN - 4).multiply(4906))
      .add(Binomial.binomial(m, mN - 5).multiply(7927))
      .add(Binomial.binomial(m, mN - 6).multiply(6090))
      .add(Binomial.binomial(m, mN - 7).multiply(1794));
  }
}
