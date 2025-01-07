package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074053 Numbers n such that A001414(n) = sum of composites from the smallest prime factor of n to the largest prime factor of n.
 * @author Sean A. Irvine
 */
public class A074053 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z sopfr = fs.sopfr();
      Z sum = Z.ZERO;
      for (Z k = fs.leastPrimeFactor().add(1); k.compareTo(fs.largestPrimeFactor()) < 0; k = k.add(1)) {
        if (!k.isProbablePrime()) {
          sum = sum.add(k);
          if (sum.compareTo(sopfr) > 0) {
            break;
          }
        }
      }
      if (sum.equals(sopfr)) {
        return Z.valueOf(mN);
      }
    }
  }
}
