package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007744.
 * @author Sean A. Irvine
 */
public class A007744 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN + 3, mN).multiply(Binomial.binomial(mN + 3, 3));
  }
}
