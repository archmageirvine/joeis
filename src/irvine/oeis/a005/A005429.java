package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005429 Ap\u00e9ry numbers: <code>n^3*C(2n,n)</code>.
 * @author Sean A. Irvine
 */
public class A005429 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).multiply(mN).multiply(mN).multiply(mN);
  }
}
