package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicIntArray;

/**
 * A001462.
 * @author Sean A. Irvine
 */
public class A001462 implements Sequence {

  private long mN = 0;
  private final LongDynamicIntArray mA = new LongDynamicIntArray();

  @Override
  public Z next() {
    final int t = ++mN == 1 ? 1 : 1 + mA.get(mN - mA.get(mA.get(mN - 1)));
    mA.set(mN, t);
    return Z.valueOf(t);
  }
}
