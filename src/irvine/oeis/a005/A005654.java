package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005654.
 * @author Sean A. Irvine
 */
public class A005654 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN - 1, mN).add(Binomial.binomial(mN - 1, mN / 2)).divide2();
  }
}
