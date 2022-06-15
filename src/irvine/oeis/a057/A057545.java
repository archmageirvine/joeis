package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a014.A014137;

/**
 * A057545 Maximum cycle size in range [A014137(n-1)..A014138(n-1)] of permutation A057505/A057506.
 * @author Sean A. Irvine
 */
public class A057545 extends A014137 {

  private final TreeSet<Integer> mDone = new TreeSet<>();
  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A057505());
  private int mM = 0;

  @Override
  public Z next() {
    mDone.clear();
    long longest = 0;
    final int limit = super.next().intValueExact();
    while (mM < limit) {
      if (mDone.add(mM)) {
        int cnt = 0;
        int s = mM;
        do {
          s = mSeq.a(s).intValueExact();
          ++cnt;
          mDone.add(s);
        } while (s != mM);
        if (cnt > longest) {
          longest = cnt;
        }
      }
      ++mM;
    }
    return Z.valueOf(longest);
  }
}
