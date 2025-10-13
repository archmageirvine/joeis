package irvine.oeis.a081;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014137;
import irvine.oeis.a057.A057505;
import irvine.oeis.memory.MemorySequence;

/**
 * A081164 Number of distinct cycle lengths in range [A014137(n-1)..A014138(n-1)] of permutation A057505/A057506.
 * @author Sean A. Irvine
 */
public class A081164 extends A014137 {

  private final TreeSet<Integer> mDone = new TreeSet<>();
  private final MemorySequence mSeq;
  private int mM = 0;

  protected A081164(final Sequence seq) {
    mSeq = MemorySequence.cachedSequence(seq);
  }

  /** Construct the sequence. */
  public A081164() {
    this(new A057505());
  }

  @Override
  public Z next() {
    mDone.clear();
    final int limit = super.next().intValueExact();
    final HashSet<Long> lengths = new HashSet<>();
    while (mM < limit) {
      if (mDone.add(mM)) {
        int s = mM;
        long cnt = 0;
        do {
          ++cnt;
          s = mSeq.a(s).intValueExact();
          mDone.add(s);
        } while (s != mM);
        lengths.add(cnt);
      }
      ++mM;
    }
    return Z.valueOf(lengths.size());
  }
}
