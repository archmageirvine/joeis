package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004709 Cubefree numbers: numbers that are not divisible by <code>any</code> cube <code>&gt; 1</code>.
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

