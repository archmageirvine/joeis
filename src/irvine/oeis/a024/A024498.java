package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024498 <code>a(n) = [ C(2n,n)/n ]</code>.
 * @author Sean A. Irvine
 */
public class A024498 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).divide(mN);
  }
}
