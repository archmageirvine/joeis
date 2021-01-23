package irvine.oeis.a038;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038109 Divisible exactly by the square of a prime.
 * @author Sean A. Irvine
 */
public class A038109 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      for (final Z p : fs.toZArray()) {
        if (fs.getExponent(p) == 2) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
