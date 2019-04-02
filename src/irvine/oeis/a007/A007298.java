package irvine.oeis.a007;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A007298 Sums of consecutive Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A007298 implements Sequence {

  private final TreeSet<Z> mNotYetOutput = new TreeSet<>();
  private final A000045 mFibo = new A000045();
  private Z mLastOutput = Z.NEG_ONE;
  private Z mPrev = mFibo.next();
  private Z mNext = mFibo.next();

  @Override
  public Z next() {
    while (mNotYetOutput.isEmpty() || mNotYetOutput.first().compareTo(mNext.subtract(mPrev)) > 0) {
      final A000045 fibo = new A000045();
      Z d;
      do {
         d = mNext.subtract(fibo.next());
         if (d.compareTo(mLastOutput) > 0) {
           mNotYetOutput.add(d);
         }
      } while (d.signum() > 0);
      mPrev = mNext;
      mNext = mFibo.next();
    }
    mLastOutput = mNotYetOutput.pollFirst();
    return mLastOutput;
  }
}
