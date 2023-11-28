package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A066416 Number of numbers m such that the sum of the anti-divisors of m is n+1.
 * @author Sean A. Irvine
 */
public class A066416 extends Sequence1 {

  private final Sequence mA = new A066417();
  private final LongDynamicLongArray mCounts = new LongDynamicLongArray();
  private long mN = 0;

  private void step() {
    mCounts.increment(mA.next().longValueExact());
  }

  @Override
  public Z next() {
    step();
    step();
    return Z.valueOf(mCounts.get(++mN));
  }
}
