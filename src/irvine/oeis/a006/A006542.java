package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006542.
 * @author Sean A. Irvine
 */
public class A006542 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 3).multiply(Binomial.binomial(mN - 1, 3)).divide(4);
  }
}
