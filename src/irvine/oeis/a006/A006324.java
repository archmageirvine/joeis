package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006324 a(n) = n*(n + 1)*(2*n^2 + 2*n - 1)/6.
 * @author Sean A. Irvine
 */
public class A006324 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, 2).add(Binomial.binomial(mN + 1, 4).multiply(8));
  }
}

