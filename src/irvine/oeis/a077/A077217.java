package irvine.oeis.a077;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077217 extends Sequence0 {

  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = Functions.NEXT_PRIME.l(mP);
      final long q = Functions.NEXT_PRIME.l(mP);
      final FactorSequence fs = new FactorSequence();
      for (long c = mP + 1; c < q; ++c) {
        fs.add(c);
      }
      Jaguar.factor(fs);
      final int v2 = fs.getExponent(Z.TWO);
      fs.remove(Z.TWO);
      if (fs.maxExponent() >= v2) {
        return Z.valueOf(mP);
      }
    }
  }
}

