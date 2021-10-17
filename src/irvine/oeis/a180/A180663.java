package irvine.oeis.a180;
// manually 2021-10-14

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.a001.A001654;
import irvine.oeis.triangle.Triangle;

/**
 * A180663 Mirror image of the Golden Triangle: T(n,k) = A001654(n-k) for n&gt;=0 and 0&lt;=k&lt;=n. 
 * @author Georg Fischer
 */
public class A180663 extends Triangle {

  protected MemorySequence mSeq = MemorySequence.cachedSequence(new A001654());

  @Override
  protected Z compute(final int n, final int k) {
    return mSeq.a(n - k);
  }
}
