package irvine.oeis.a028;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A028890 Product of digits of n is a nonzero Fibonacci number.
 * @author Sean A. Irvine
 */
public class A028890 extends A000045 {

  private final TreeSet<Long> mFibo = new TreeSet<>();
  private long mN = 0;
  {
    setOffset(1);
    mFibo.add(1L);
    super.next(); // exclude 0
  }

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      final long u = Functions.DIGIT_PRODUCT.l(n);
      while (u > mFibo.last()) {
        mFibo.add(super.next().longValueExact());
      }
      if (mFibo.contains(u)) {
        return Z.valueOf(mN);
      }
    }
  }
}
