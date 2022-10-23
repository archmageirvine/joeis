package irvine.oeis.a056;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051626;
import irvine.oeis.a051.A051628;

/**
 * A056055 Integers &gt; 1 where the decimal expansion of 1/n contains n as a string (if 1/n is finite, trailing zeros do not count).
 * @author Sean A. Irvine
 */
public class A056055 extends Sequence1 {

  private final Sequence mPreperiod = new A051628();
  private final Sequence mPeriod = new A051626();
  {
    // skip 1
    mPeriod.next();
    mPreperiod.next();
  }
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int period = mPeriod.next().intValueExact();
      final int preperiod = mPreperiod.next().intValueExact();
      final int expand = preperiod + 2 * period;
      final String s = CR.valueOf(new Q(1, mN)).toString(expand);
      if (s.contains(String.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
