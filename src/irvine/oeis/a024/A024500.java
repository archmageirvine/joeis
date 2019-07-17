package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024500 <code>a(n) = [ C(2n,n)/n^2 ]</code>.
 * @author Sean A. Irvine
 */
public class A024500 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).divide(mN).divide(mN);
  }
}
