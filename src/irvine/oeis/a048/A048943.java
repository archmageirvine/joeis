package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048943.
 * @author Sean A. Irvine
 */
public class A048943 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int[] res = new int[4];
      final FactorSequence fs = Cheetah.factor(++mN);
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

