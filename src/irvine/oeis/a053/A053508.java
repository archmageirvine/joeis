package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053508 a(n) = binomial(n-1,3)*n^(n-4).
 * @author Sean A. Irvine
 */
public class A053508 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return ++mN < 4 ? Z.ZERO : Binomial.binomial(mN - 1, 3).multiply(Z.valueOf(mN).pow(mN - 4));
  }
}

