package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005566.
 * @author Sean A. Irvine
 */
public class A005566 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, mN / 2).multiply(Binomial.binomial(mN + 1, (mN + 1) / 2));
  }
}

