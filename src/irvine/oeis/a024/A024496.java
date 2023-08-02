package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024496 a(n) = (3/(8n-4))*C(4n,n).
 * @author Sean A. Irvine
 */
public class A024496 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(4L * mN, mN).multiply(3).divide(8L * mN - 4);
  }
}
