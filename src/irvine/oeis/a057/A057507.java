package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a014.A014137;
import irvine.oeis.memory.MemorySequence;

/**
 * A057507 Number of cycles in range [A014137(n-1)..A014138(n-1)] of permutation A057505/A057506.
 * @author Sean A. Irvine
 */
public class A057507 extends A014137 {

  private final TreeSet<Integer> mDone = new TreeSet<>();
  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A057505());
  private int mM = 0;

  @Override
  public Z next() {
    mDone.clear();
    final int limit = super.next().intValueExact();
    int cnt = 0;
    while (mM < limit) {
      if (mDone.add(mM)) {
        ++cnt;
        int s = mM;
        do {
          s = mSeq.a(s).intValueExact();
          mDone.add(s);
        } while (s != mM);
      }
      ++mM;
    }
    return Z.valueOf(cnt);
  }
}
