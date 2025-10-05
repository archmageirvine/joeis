package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080948 Least number m having n divisors that are also suffixes of m in binary representation.
 * @author Sean A. Irvine
 */
public class A080948 extends Sequence1 {

  private long mN = 0;
  private Z mM = Z.ONE;

  private long count(final Z m) {
    long cnt = 0;
    final String s = m.toString(2);
    for (final Z d : Jaguar.factor(m).divisors()) {
      if (s.endsWith(d.toString(2))) {
        ++cnt;
      }
    }
    return cnt;
  }

  @Override
  public Z next() {
    ++mN;
    while (count(mM) < mN) {
      mM = mM.add(1);
    }
    return mM;
  }
}
