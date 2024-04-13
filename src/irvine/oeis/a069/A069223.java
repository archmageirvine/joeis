package irvine.oeis.a069;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069218.
 * @author Sean A. Irvine
 */
public class A069223 extends Sequence0 {

  // After Jean-Fran&ccedil;ois Alcover

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 3; k <= 3 * mN; ++k) {
      final int kk = k; // Make final for lambda
      sum = sum.signedAdd((k & 1) == 0,
        Integers.SINGLETON.sum(3, k,
          p -> Z.NEG_ONE.pow(p).multiply(Z.valueOf(p - 2).multiply(p - 1).multiply(p).pow(mN)).multiply(Binomial.binomial(kk, p)))
          .divide(MemoryFactorial.SINGLETON.factorial(k)));
    }
    return sum;
  }
}

