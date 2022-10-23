package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A024499 a(n) = [ C(2n,n)/(n-1) ].
 * @author Sean A. Irvine
 */
public class A024499 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).divide(mN - 1);
  }
}
