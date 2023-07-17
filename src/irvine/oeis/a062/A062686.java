package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000578;
import irvine.util.array.LongDynamicArray;

/**
 * A062686 Smallest cube with digit sum n (or 0 if no such cube exists).
 * @author Sean A. Irvine
 */
public class A062686 extends A000578 {

  /** Construct the sequence. */
  public A062686() {
    super(1);
  }

  private final LongDynamicArray<Z> mFirsts = new LongDynamicArray<>();
  private long mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    final long r = ++mN % 9;
    if (r >= 2 && r <= 7) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == null) {
      final Z cube = super.next();
      final long d = ZUtils.digitSum(cube);
      if (mFirsts.get(d) == null) {
        mFirsts.set(d, cube);
      }
    }
    return mFirsts.get(mN);
  }
}
