package irvine.oeis.a081;

import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081391 Numbers k such that the central binomial coefficient C(2*k,k) has only one prime divisor whose exponent equals one.
 * @author Sean A. Irvine
 */
public class A081392 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z b = Binomial.binomial(++mN, mN / 2);
      if (b.mod(4 * 9) != 0 && b.mod(4 * 25) != 0 && b.mod(9 * 25) != 0) {
        final FactorSequence fs = mFactor.factorize(b);
        int cnt = 0;
        for (final Z p : fs.toZArray()) {
          if (fs.getExponent(p) > 1 && ++cnt > 1) {
            break;
          }
        }
        if (cnt == 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

