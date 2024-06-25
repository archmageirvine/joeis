package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A070962 a(n) = Card{ k&lt;=n | omega(k)!=omega(n) }, where omega(n) = A001221(n).
 * @author Sean A. Irvine
 */
public class A070962 extends Sequence1 {

  private final DynamicLongArray mCounts = new DynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    final int omega = Functions.OMEGA.i(++mN);
    return Z.valueOf(mN - mCounts.increment(omega));
  }
}
