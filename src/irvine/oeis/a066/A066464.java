package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicLongArray;

/**
 * A066464 Least number k such that k has n anti-divisors.
 * @author Sean A. Irvine
 */
public class A066464 extends Sequence0 {

  private final LongDynamicLongArray mFirsts = new LongDynamicLongArray();
  private final Sequence mA = new A066272();
  private int mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      ++mM;
      final long ad = mA.next().longValueExact();
      if (mFirsts.get(ad) == 0) {
        mFirsts.set(ad, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

