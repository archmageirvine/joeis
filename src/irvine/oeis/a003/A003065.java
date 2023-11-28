package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * A003065 Number of integers with a shortest addition chain of length n.
 * @author Sean A. Irvine
 */
public class A003065 extends A003313 {

  /** Construct the sequence. */
  public A003065() {
    super(0);
  }

  private final DynamicLongArray mCounts = new DynamicLongArray();
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    ++mN;
    final int limit = 1 << mN;
    while (mM <= limit) {
      mCounts.increment(super.next().intValueExact());
      ++mM;
    }
    return Z.valueOf(mCounts.get(mN));
  }
}
