package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000796;

/**
 * A383732 a(n) is the smallest k such that every digit from 0 to 9 appears at least n times among the first k digits of Pi (after the decimal point).
 * @author Sean A. Irvine
 */
public class A383732 extends Sequence1 {

  private final Sequence mPi = new A000796().skip();
  private final long[] mCounts = new long[10];
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      ++mM;
      if (++mCounts[mPi.next().intValue()] == mN && Functions.MIN.l(mCounts) == mN) {
        return Z.valueOf(mM);
      }
    }
  }
}
