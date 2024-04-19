package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A064002 List pairs (i,j) with 1 &lt;= i &lt;= j in colexicographic order: (1,1), (1,2), (2,2), (1,3), (2,3), (3,3), (1,4), ... Let a(1) = 1. Then for n&gt;=2 if the (n-1)-st pair is (i,j) then a(n) = a(i) + a(j) + 1.
 * @author Sean A. Irvine
 */
public class A064002 extends Sequence1 {

  private final MemorySequence mSeq = new MemorySequence() {
    private int mN = 0;
    private int mM = 0;

    @Override
    protected Z computeNext() {
      if (size() == 0) {
        return Z.ONE;
      }
      if (++mM > mN) {
        ++mN;
        mM = 1;
      }
      return a(mN - 1).add(a(mM - 1)).add(1);
    }
  };

  @Override
  public Z next() {
    return mSeq.next();
  }
}
