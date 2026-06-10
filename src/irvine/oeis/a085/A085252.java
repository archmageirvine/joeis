package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001694;
import irvine.util.array.LongDynamicIntArray;

/**
 * A085252 Number of ways to write n as sum of two powerful numbers (A001694).
 * @author Sean A. Irvine
 */
public class A085252 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A001694());
  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  private long mM = 1;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN >= mA.a(mM).longValueExact()) {
      for (long k = 1; k <= mM; ++k) {
        mCounts.increment(mA.a(k).add(mA.a(mM)).longValueExact());
      }
      ++mM;
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
