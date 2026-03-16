package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a381.A381466;
import irvine.util.array.LongDynamicLongArray;

/**
 * A392754 a(n) = the smallest value k such that A381466(k) = n or -1 if no such k exists.
 * @author Sean A. Irvine
 */
public class A392754 extends Sequence1 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private final Sequence mS = new A381466();
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mM <= 6 * mN * mN - 2 * mN) {
      ++mM;
      final long s = mS.next().longValueExact();
      if (mFirsts.get(s) == 0) {
        mFirsts.set(s, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN) - 1);
  }
}

