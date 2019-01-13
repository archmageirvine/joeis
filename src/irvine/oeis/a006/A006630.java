package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006630.
 * @author Sean A. Irvine
 */
public class A006630 implements Sequence {

  private long mN = -1;
  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN + 6, mN).multiply2().divide(mN + 2);
  }

}

