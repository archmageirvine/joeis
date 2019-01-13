package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001694.
 * @author Sean A. Irvine
 */
public class A001694 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    while (true) {
      final FactorSequence fs = Cheetah.factor(mN);
      boolean ok = true;
      for (final Z f : fs.toZArray()) {
        if (fs.getExponent(f) == 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mN);
      }
      ++mN;
    }
  }
}
