package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024488 a(n) = (1/(3n-1))*M(3n; n,n,n), where M(...) is a multinomial coefficient.
 * @author Sean A. Irvine
 */
public class A024488 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.multinomial(3 * mN, mN, mN, mN).divide(3 * mN - 1);
  }
}
