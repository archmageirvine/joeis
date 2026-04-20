package irvine.oeis.a394;

import java.util.LinkedList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A394854 Sequence where k is appended after every F(k+1) occurrences of 1 where F(k) is k-th term of the Fibonacci sequence (A000045), with multiple values following a 1 listed in order.
 * @author Sean A. Irvine
 */
public class A394854 extends Sequence1 {

  private final LongDynamicLongArray mDownCounters = new LongDynamicLongArray();
  private final LinkedList<Z> mQueue = new LinkedList<>();
  private long mOnes = 0;
  private long mLen = 1;

  @Override
  public Z next() {
    if (mQueue.isEmpty()) {
      mQueue.add(Z.ONE);
      final long f = Functions.FIBONACCI.l(mLen + 2);
      if (++mOnes >= f) {
        mDownCounters.set(++mLen, 1);
      }
      for (long k = 2; k <= mLen; ++k) {
        final long c = mDownCounters.get(k) - 1;
        if (c <= 0) {
          mDownCounters.set(k, Functions.FIBONACCI.l(k + 1));
          mQueue.add(Z.valueOf(k));
        } else {
          mDownCounters.set(k, c);
        }
      }
    }
    return mQueue.pollFirst();
  }
}
