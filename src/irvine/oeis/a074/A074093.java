package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A074093 Number of values of k such that n = k - largest divisor of k (&lt;k).
 * @author Sean A. Irvine
 */
public class A074093 extends Sequence1 {

  private final LongDynamicIntArray mCounts = new LongDynamicIntArray();
  private int mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    mCounts.increment(++mM - mM / Functions.LPF.l(mM));
    mCounts.increment(++mM - mM / Functions.LPF.l(mM));
    return Z.valueOf(mCounts.get(++mN));
  }
}
