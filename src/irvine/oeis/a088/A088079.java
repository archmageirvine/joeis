package irvine.oeis.a088;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A088079.
 * @author Sean A. Irvine
 */
public class A088079 implements Sequence {

  protected int mN = -1;
  private long mPrev = 0;

  private boolean cascade(final long candidate, final int power) {
    if (power <= 1) {
      return true;
    }
    final int exp = Cheetah.factor(candidate).maxExponent();
    return exp >= power && cascade(candidate - 1, power - 1);
  }

  @Override
  public Z next() {
    ++mN;
    long v = Math.max(mN + 1, mPrev - 1);
    while (true) {
      if (cascade(v, mN)) {
        mPrev = v;
        return Z.valueOf(v);
      }
      ++v;
    }
  }
}

