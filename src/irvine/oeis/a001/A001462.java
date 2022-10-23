package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;

/**
 * A001462 Golomb's sequence: a(n) is the number of times n occurs, starting with a(1) = 1.
 * @author Sean A. Irvine
 */
public class A001462 extends Sequence1 {

  private long mN = 0;
  private final LongDynamicIntArray mA = new LongDynamicIntArray();

  @Override
  public Z next() {
    final int t = ++mN == 1 ? 1 : 1 + mA.get(mN - mA.get(mA.get(mN - 1)));
    mA.set(mN, t);
    return Z.valueOf(t);
  }
}
