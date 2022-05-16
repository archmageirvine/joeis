package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036785 Numbers divisible by the squares of two distinct primes.
 * @author Sean A. Irvine
 */
public class A036785 implements Sequence {

  private long mN = 35;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      int c = 0;
      for (final Z p : fs.toZArray()) {
        if (fs.getExponent(p) > 1 && ++c > 1) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
