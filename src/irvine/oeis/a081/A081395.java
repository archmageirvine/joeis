package irvine.oeis.a081;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081395 a(n) is the smallest value of k such that number of non-unitary prime divisors of k-th Catalan number, A000108(k) = C(2*k,k)/(k+1) equals n.
 * @author Sean A. Irvine
 */
public class A081395 extends Sequence0 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final FactorSequence fs = mFactor.factor(Binomial.binomial(2 * ++k, k).divide(k + 1));
      int cnt = 0;
      for (final Z p : fs.toZArray()) {
        if (fs.getExponent(p) > 1 && ++cnt > mN) {
          break;
        }
      }
      if (cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

