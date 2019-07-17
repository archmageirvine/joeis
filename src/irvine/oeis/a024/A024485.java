package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024485 <code>a(n) = (2/(3n-1))*C(3n,n)</code>.
 * @author Sean A. Irvine
 */
public class A024485 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(3 * mN, mN).multiply2().divide(3 * mN - 1);
  }
}
