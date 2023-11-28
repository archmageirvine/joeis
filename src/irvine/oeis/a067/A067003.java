package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A067001.
 * @author Sean A. Irvine
 */
public class A067003 extends Sequence1 {

  private final DynamicLongArray mCounts = new DynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    final int omega = Jaguar.factor(++mN).omega();
    return Z.valueOf(mCounts.add(omega, 1));
  }
}

