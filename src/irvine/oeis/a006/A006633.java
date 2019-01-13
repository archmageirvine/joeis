package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006633.
 * @author Sean A. Irvine
 */
public class A006633 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4 * mN + 5, mN).multiply2().divide(mN + 2);
  }
}

