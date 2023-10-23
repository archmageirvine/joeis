package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A066480 Start of first run of exactly n consecutive integers with same number of anti-divisors.
 * @author Sean A. Irvine
 */
public class A066480 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Sequence mA = new A066272();
  private int mN = 0;
  private long mM = 1;
  private Z mB = mA.next();

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final Z t = mB;
      int cnt = 0;
      do {
        ++cnt;
        ++mM;
        mB = mA.next();
      } while (mB.equals(t));
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mM - cnt);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

