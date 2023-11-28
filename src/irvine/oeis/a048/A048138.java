package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a001.A001065;
import irvine.util.array.LongDynamicIntArray;

/**
 * A048138 a(n) = number of m such that sum of proper divisors of m (A001065(m)) is n.
 * @author Sean A. Irvine
 */
public class A048138 extends A001065 {

  /** Construct the sequence. */
  public A048138() {
    super(2);
  }

  private final LongDynamicIntArray mA = new LongDynamicIntArray();
  private long mN = 1;
  private long mM = 0;

  @Override
  public Z next() {
    final long lim = ++mN * mN;
    while (mM <= lim) {
      mA.increment(super.next().longValueExact());
      ++mM;
    }
    return Z.valueOf(mA.get(mN));
  }
}
