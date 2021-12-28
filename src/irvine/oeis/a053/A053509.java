package irvine.oeis.a053;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053509 a(n) = binomial(n-1,4)*n^(n-5).
 * @author Sean A. Irvine
 */
public class A053509 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return ++mN < 5 ? Z.ZERO : Binomial.binomial(mN - 1, 4).multiply(Z.valueOf(mN).pow(mN - 5));
  }
}

