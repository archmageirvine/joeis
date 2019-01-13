package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005714.
 * @author Sean A. Irvine
 */
public class A005714 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, 3).multiply(Z.valueOf(mN).add(18).multiply(mN).add(17).multiply(mN).subtract(120)).divide(120);
  }
}

