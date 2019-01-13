package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006857.
 * @author Sean A. Irvine
 */
public class A006857 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 5).multiply(Binomial.binomial(mN, 4)).divide(mN);
  }
}

