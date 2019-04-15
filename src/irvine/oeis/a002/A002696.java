package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;


/**
 * A002696 Binomial coefficients <code>C(2n,n-3)</code>.
 * @author Sean A. Irvine
 */
public class A002696 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 3);
  }
}
