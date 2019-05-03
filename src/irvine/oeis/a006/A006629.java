package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006629 <code>Self-convolution 4th</code> power of <code>A001764</code>, which enumerates ternary trees.
 * @author Sean A. Irvine
 */
public class A006629 implements Sequence {

  private long mN = 1;
  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN - 3, mN - 2).multiply2().divide(mN);
  }

}

