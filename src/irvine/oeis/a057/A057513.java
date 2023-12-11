package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a014.A014137;
import irvine.oeis.memory.MemorySequence;

/**
 * A057513 Number of separate orbits to which permutations given in A057511/A057512 (induced by deep rotation of general parenthesizations/plane trees) partition each A000108(n) objects encoded by A014486 between (A014138(n-1)+1)-th and (A014138(n))-th terms.
 * @author Sean A. Irvine
 */
public class A057513 extends A014137 {

  private final TreeSet<Integer> mDone = new TreeSet<>();
  private final MemorySequence mSeq = MemorySequence.cachedSequence(new A057511());
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
