package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007226.
 * @author Sean A. Irvine
 */
public class A007226 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN, mN).multiply2().subtract(Binomial.binomial(3 * mN, mN + 1));
  }
}
