package irvine.oeis.a020;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020756 Numbers that are the sum of two triangular numbers.
 * @author Sean A. Irvine
 */
public class A020756 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    outer:
    while (true) {
      if (++mN > 4) {
        final FactorSequence fs = Jaguar.factor(4 * mN + 1);
        for (final Z p : fs.toZArray()) {
          if ((fs.getExponent(p) & 1) == 1 && p.mod(4) == 3) {
            continue outer;
          }
        }
      }
      return Z.valueOf(mN);
    }
  }
}
