package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004709 Cubefree numbers: numbers that are not divisible by any cube &gt; 1.
 * @author Sean A. Irvine
 */
public class A004709 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      boolean ok = true;
      for (final Z p : fs.toZArray()) {
        if (fs.getExponent(p) >= 3) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}

