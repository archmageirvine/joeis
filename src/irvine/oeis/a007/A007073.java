package irvine.oeis.a007;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007073.
 * @author Sean A. Irvine
 */
public class A007073 implements Sequence {

  // Similar to A007072 except the ordering of the Fibonacci sequences is
  // different.  Here we consider Fibonacci sequences starting (a,b) with b<a
  // and sort (a,b) by least a, then least b.
  //
  // We have some notion of the smallest number we have yet to see and keep
  // searching until we see that number.  At that point we can decide if it
  // should be reported.  Actually that every number appears might only be
  // a conjecture?

  private final List<List<Z>> mFibonacciSequences = new ArrayList<>();
  private final List<Z> mFirstBoxed = new ArrayList<>();
  private Z mLastReported = Z.ZERO;
  private int mA = 0;
  private int mB = 0;
  private final Set<Z> mSeen = new HashSet<>();
  private Z mFirstUnseen = Z.ONE;

  // Extend all existing sequences to exceed v
  private void extend(final Z v) {
    for (final List<Z> fibo : mFibonacciSequences) {
      while (fibo.get(fibo.size() - 1).compareTo(v) < 0) {
        final Z nextTerm = fibo.get(fibo.size() - 1).add(fibo.get(fibo.size() - 2));
        mSeen.add(nextTerm);
        fibo.add(nextTerm);
      }
    }
  }

  @Override
  public Z next() {
    while (true) {
      // Keep searching if we have no unreported first boxed numbers, or all unreported
      // first boxed numbers exceed the first unseen number
      for (final Z b : mFirstBoxed) {
        if (b.compareTo(mLastReported) > 0 && b.compareTo(mFirstUnseen) <= 0) {
          mLastReported = b;
          return b;
        }
      }
      // Extend all existing sequences to first unseen
      extend(mFirstUnseen);
      while (!mSeen.contains(mFirstUnseen)) {
        // Still don't have it, add a new sequence to the mix and compute its first boxed term
        if (++mB >= mA) {
          mB = 0;
          ++mA;
        }
        final List<Z> fibo = new ArrayList<>();
        Z aa = Z.valueOf(mA);
        Z bb = Z.valueOf(mB);
        fibo.add(aa);
        fibo.add(bb);
        // Exclude first step from boxing search
        aa = bb;
        bb = bb.add(mA);
        fibo.add(bb);
        do {
          final Z t = aa.add(bb);
          aa = bb;
          bb = t;
          fibo.add(bb);
          extend(bb); // Extend all other sequences to the putative first box for this sequence
        } while (mSeen.contains(bb));
        mSeen.add(bb);
        mFirstBoxed.add(bb);
        mFibonacciSequences.add(fibo);
      }
      mFirstUnseen = mFirstUnseen.add(1);
    }
  }
}
