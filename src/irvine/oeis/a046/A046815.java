package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000119;
import irvine.util.array.DynamicLongArray;

/**
 * A046815 Smallest number which can be written as the sum of distinct Fibonacci numbers in n ways and such that the Zeckendorf representation of the number uses only even-subscripted Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A046815 extends A000119 {

  private final Sequence mFibo = new A000045();
  private long mM = -1;
  private int mN = 0;
  private final DynamicLongArray mFirst = new DynamicLongArray();
  private final DynamicLongArray mFiboCache = new DynamicLongArray();

  private long fibo(final int k) {
    while (k >= mFiboCache.length()) {
      mFiboCache.set(mFiboCache.length(), mFibo.next().longValueExact());
    }
    return mFiboCache.get(k);
  }

  private boolean isEvenIndexZeckendorf(final long n) {
    int k = 1;
    while (fibo(k) <= n) {
      ++k;
    }
    long m = n;
    while (m != 0) {
      final long f = fibo(k);
      if (f > m) {
        --k;
      } else {
        if ((k & 1) == 1) {
          return false;
        }
        m -= f;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == 0) {
      ++mM;
      final int v = super.next().intValueExact();
      if (mFirst.get(v) == 0 && isEvenIndexZeckendorf(mM)) {
        mFirst.set(v, mM);
      }
    }
    return Z.valueOf(mFirst.get(mN));
  }
}
