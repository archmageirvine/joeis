package irvine.oeis.a050;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A050120 Numbers of the form Fibonacci(i)*Lucas(j), 0 &lt;= i &lt; j.
 * @author Sean A. Irvine
 */
public class A050120 implements Sequence {

  private final MemorySequence mFibo = MemorySequence.cachedSequence(new A000045());
  private final MemorySequence mLucas = MemorySequence.cachedSequence(new A000032());
  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mPrev = Z.NEG_ONE;
  private int mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mLucas.a(mN)) > 0) {
      final Z ln = mLucas.a(mN);
      for (int k = mN - 1; k >= 0; --k) {
        final Z prod = ln.multiply(mFibo.a(k));
        if (prod.compareTo(mPrev) <= 0) {
          break;
        }
        mA.add(prod);
      }
      ++mN;
    }
    mPrev = mA.pollFirst();
    return mPrev;
  }
}
