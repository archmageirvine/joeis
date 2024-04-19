package irvine.oeis.a013;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013703 Series(W(exp(1)*(1+x)), x) = sum( a[ n ]/(2^(2*n)*n!), n=0..infinity), where W is the Lambert W function.
 * @author Sean A. Irvine
 */
public class A013703 extends Sequence0 {

  // After Paolo Bonzini

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.valueOf(mN + 1);
    }
    Q ksum = Q.ZERO;
    for (int k = 1; k < mN; ++k) {
      Q jsum = Q.ZERO;
      for (int j = 1; j <= k; ++j) {
        Q lsum = Q.ZERO;
        for (int l = 1; l <= j; ++l) {
          final Z zl = Z.valueOf(l);
          Q isum = Q.ZERO;
          for (int i = 0; i <= l; ++i) {
            isum = isum.add(new Q(Binomial.binomial(l, i).multiply(zl.pow(mN + j - i - 1)), Functions.FACTORIAL.z(mN + j - i - 1)));
          }
          lsum = lsum.signedAdd((l & 1) == 0, isum.multiply(Binomial.binomial(j, l)));
        }
        jsum = jsum.add(lsum.multiply(Binomial.binomial(k, j).shiftLeft(mN - j - 1)));
      }
      ksum = ksum.add(jsum.multiply(Binomial.binomial(mN + k - 1, mN - 1)));
    }
    return ksum.multiply(Functions.FACTORIAL.z(mN - 1)).multiply(2).toZ();
  }
}
