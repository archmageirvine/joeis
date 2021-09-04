package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051283 Numbers k such that if one writes k = Product p_i^e_i (p_i primes) and P = max p_i^e_i, then k/P &gt; P.
 * @author Sean A. Irvine
 */
public class A051283 implements Sequence {

  private long mN = 29;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      Z max = Z.ZERO;
      for (final Z p : fs.toZArray()) {
        final Z pp = p.pow(fs.getExponent(p));
        max = max.max(pp);
      }
      if (max.square().longValueExact() < mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
