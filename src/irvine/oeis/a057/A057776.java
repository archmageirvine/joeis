package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicLongArray;

/**
 * A057776 a(n)-th prime is smallest such that p(a(n))-1 is divisible by 2^(n-1) and quotient is odd.
 * @author Sean A. Irvine
 */
public class A057776 extends A000040 {

  private final LongDynamicLongArray mLeast = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mLeast.get(mN) == 0) {
      final Z p = super.next();
      ++mM;
      final long zeros = p.subtract(1).makeOdd().auxiliary();
      if (mLeast.get(zeros) == 0) {
        mLeast.set(zeros, mM);
      }
    }
    return Z.valueOf(mLeast.get(mN));
  }
}
