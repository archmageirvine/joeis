package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007403 a(n) = Sum_{m=0..n} (Sum_{k=0..m} binomial(n,k))^3 = (n+2)*2^(3*n-1) - 3*2^(n-2)*n*binomial(2*n,n).
 * @author Sean A. Irvine
 */
public class A007403 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN + 2).shiftLeft(3 * mN - 1).subtract(Binomial.binomial(2L * mN, mN).multiply(3L * mN).shiftLeft(mN - 2));
  }
}

