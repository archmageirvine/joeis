package irvine.oeis.a081;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a014.A014137;
import irvine.oeis.a057.A057505;
import irvine.oeis.memory.MemorySequence;

/**
 * A081150 Number of even cycles in range [A014137(n-1)..A014138(n-1)] of permutation A057505/A057506.
 * @author Sean A. Irvine
 */
public class A081150 extends A014137 {

  private final TreeSet<Integer> mDone = new TreeSet<>();
  private final MemorySequence mSeq;
  private int mM = 0;

  protected A081150(final Sequence seq) {
    mSeq = MemorySequence.cachedSequence(seq);
  }

  /** Construct the sequence. */
  public A081150() {
    this(new A057505());
  }

  @Override
  public Z next() {
    mDone.clear();
    final int limit = super.next().intValueExact();
    int cnt = 0;
    while (mM < limit) {
      if (mDone.add(mM)) {
        int s = mM;
        boolean even = true;
        do {
          even = !even;
          s = mSeq.a(s).intValueExact();
          mDone.add(s);
        } while (s != mM);
        if (even) {
          ++cnt;
        }
      }
      ++mM;
    }
    return Z.valueOf(cnt);
  }
}
