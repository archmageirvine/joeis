package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000028.
 * @author Sean A. Irvine
 */
public class A000028 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      long exp = 0;
      for (final Z d : fs.toZArray()) {
        exp += Integer.bitCount(fs.getExponent(d));
      }
      if ((exp & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }

}

