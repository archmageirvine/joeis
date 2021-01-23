package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024485 a(n) = (2/(3*n-1))*binomial(3*n,n).
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
