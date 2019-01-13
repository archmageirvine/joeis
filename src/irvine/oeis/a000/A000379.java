package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000379.
 * @author Sean A. Irvine
 */
public class A000379 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      long exp = 0;
      for (final Z d : fs.toZArray()) {
        exp += Integer.bitCount(fs.getExponent(d));
      }
      if ((exp & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }

}

