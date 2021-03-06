package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004978;

/**
 * A048201 Triangular array T read by rows: T(i,j)=b(i+1)-b(i+1-j); j=1,2,...,i; i=1,2,3,...; b=A004978.
 * @author Sean A. Irvine
 */
public class A048201 implements Sequence {

  private final MemorySequence mB = MemorySequence.cachedSequence(new A004978());
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.a(mN).subtract(mB.a(mN - mM));
  }
}
