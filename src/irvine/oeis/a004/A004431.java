package irvine.oeis.a004;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004431.
 * @author Sean A. Irvine
 */
public class A004431 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      boolean seen1 = false;
      boolean seen3 = true;
      for (final Z p : fs.toZArray()) {
        final long r = p.mod(4);
        if (r == 1) {
          seen1 = true;
        } else if (r == 3) {
          final int e = fs.getExponent(p);
          if ((e & 1) == 1) {
            seen3 = false;
            break;
          }
        }
      }
      if (seen1 && seen3) {
        return Z.valueOf(mN);
      }
    }
  }
}

