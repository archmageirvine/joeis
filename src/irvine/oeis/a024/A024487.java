package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024487 a(n) = (1/(4n+2))*M(3n; n,n,n).
 * @author Sean A. Irvine
 */
public class A024487 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.multinomial(3 * mN, mN, mN, mN).divide(4L * mN + 2);
  }
}
