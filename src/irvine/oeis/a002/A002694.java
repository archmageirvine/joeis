package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;


/**
 * A002694 Binomial coefficients <code>C(2n,n-2)</code>.
 * @author Sean A. Irvine
 */
public class A002694 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 2);
  }
}
