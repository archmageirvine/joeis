package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.util.array.LongDynamicLongArray;

/**
 * A119436 Inverse permutation to sequence A119435.
 * @author Sean A. Irvine
 */
public class A119436 extends A119435 {

  private long mN = 0;
  private long mC = 0;
  private final LongDynamicLongArray mInverse = new LongDynamicLongArray();

  @Override
  public Z next() {
    ++mN;
    while (mInverse.get(mN) == 0) {
      mInverse.set(super.next().longValue(), ++mC);
    }
    return Z.valueOf(mInverse.get(mN));
  }
}
