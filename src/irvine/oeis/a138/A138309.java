package irvine.oeis.a138;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A138309.
 * @author Sean A. Irvine
 */
public class A138309 implements Sequence {

  private long mN = 0;
  private long mT = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(++mN);
    while (true) {
      ++mT;
      boolean ok = true;
      for (final Z f : fs.toZArray()) {
        final int e = fs.getExponent(f);
        if (LongUtils.gcd(mT, e) != 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mT);
      }
    }
  }
}

