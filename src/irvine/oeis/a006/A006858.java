package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006858.
 * @author Sean A. Irvine
 */
public class A006858 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 4, 5).multiply(mN + 1).divide(12);
  }
}

