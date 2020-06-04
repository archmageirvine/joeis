package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005430 Ap\u00e9ry numbers: <code>n*C(2*n,n)</code>.
 * @author Sean A. Irvine
 */
public class A005430 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).multiply(mN);
  }
}
