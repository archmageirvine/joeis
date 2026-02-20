package irvine.oeis.a081;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081393 a(n) is the smallest k such that number of non-unitary prime divisors of central binomial coefficient, A000984(k) = C(2*k,k) equals n.
 * @author Sean A. Irvine
 */
public class A081393 extends Sequence0 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final FactorSequence fs = mFactor.factor(Binomial.binomial(2 * ++k, k));
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

