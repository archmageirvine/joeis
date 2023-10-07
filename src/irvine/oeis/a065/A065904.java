package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065904 Integers i &gt; 1 for which there is one prime p such that i is a solution mod p of x^4 = 2.
 * @author Sean A. Irvine
 */
public class A065904 extends Sequence1 {

  private final long mTarget;
  private Z mN = Z.ZERO;

  protected A065904(final long target) {
    mTarget = target;
  }

  /** Construct the sequence. */
  public A065904() {
    this(1);
  }

  private boolean is(final Z n) {
    long cnt = 0;
    for (final Z p : Jaguar.factor(n.pow(4).subtract(2)).toZArray()) {
      if (p.compareTo(n) > 0 && ++cnt > mTarget) {
        return false;
      }
    }
    return cnt == mTarget;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}
