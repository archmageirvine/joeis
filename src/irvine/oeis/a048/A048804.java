package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence0;

/**
 * A048804 Triangle: T(n,k)=b(n)/(b(k)*b(n-k)) where b is A048803.
 * @author Sean A. Irvine
 */
public class A048804 extends Sequence0 {

  private final MemorySequence mB = MemorySequence.cachedSequence(new A048803());
  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.a(mN).divide(mB.a(mM)).divide(mB.a(mN - mM));
  }
}
