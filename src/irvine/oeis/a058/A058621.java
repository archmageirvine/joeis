package irvine.oeis.a058;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058621 a(n) = 1/2*binomial(2*n,n) - (1+(-1)^n)/4*(binomial(n,floor(n/2)))^2.
 * @author Sean A. Irvine
 */
public class A058621 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final Z t = Binomial.binomial(2 * ++mN, mN);
    return ((mN & 1) == 1 ? t : t.subtract(Binomial.binomial(mN, mN / 2).square())).divide2();
  }
}
