package irvine.oeis.a060;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a014.A014137;
import irvine.oeis.a057.A057505;

/**
 * A060114 Least common multiple of all cycle sizes in range [A014137(n-1)..A014138(n-1)] of permutation A057505/A057506.
 * @author Sean A. Irvine
 */
public class A060114 extends A014137 {

  private final TreeSet<Integer> mDone = new TreeSet<>();
  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A057505());
  private int mM = 0;

  @Override
  public Z next() {
    mDone.clear();
    final int limit = super.next().intValueExact();
    Z lcm = Z.ONE;
    while (mM < limit) {
      if (mDone.add(mM)) {
        int cnt = 0;
        int s = mM;
        do {
          s = mSeq.a(s).intValueExact();
          mDone.add(s);
          ++cnt;
        } while (s != mM);
        lcm = lcm.lcm(Z.valueOf(cnt));
      }
      ++mM;
    }
    return lcm;
  }
}
