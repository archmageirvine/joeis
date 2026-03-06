package irvine.oeis.a393;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393746 allocated for Fr\u00e9d\u00e9ric D. W. Heidenthal-K\u00f6nig.
 * @author Sean A. Irvine
 */
public class A393746 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    if (mM == 0) {
      return Z.valueOf(2 * mN - 1);
    }
    long cnt = 0;
    for (final Z d : Jaguar.factor(mM * mN).divisors()) {
      if (d.compareTo(mM) > 0 && d.compareTo(mN) < 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

