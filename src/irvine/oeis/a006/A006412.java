package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006412 Nonseparable planar tree-rooted maps with <code>n + 3</code> edges and 4 vertices.
 * @author Sean A. Irvine
 */
public class A006412 implements Sequence {

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
