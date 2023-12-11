package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004979;
import irvine.oeis.memory.MemorySequence;

/**
 * A048212 Triangular array T read by rows: T(i,j)=b(i+1)-b(i+1-j); j=1,2,...,i; i=1,2,3,...; b=A004979.
 * @author Sean A. Irvine
 */
public class A048212 extends Sequence1 {

  private final MemorySequence mB = MemorySequence.cachedSequence(new A004979());
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
