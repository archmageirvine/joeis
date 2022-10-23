package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048943 Product of divisors of n is a square.
 * @author Sean A. Irvine
 */
public class A048943 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int[] res = new int[4];
      final FactorSequence fs = Jaguar.factor(++mN);
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p) & 3;
        ++res[e];
      }
      if (res[3] > 0 || res[1] + res[3] > 1 || (res[1] == 0 && res[2] == 0 && res[3] == 0)) {
        return Z.valueOf(mN);
      }
    }
  }
}

