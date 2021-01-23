package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004018;

/**
 * A002611 Glaisher's function V(n).
 * @author Sean A. Irvine
 */
public class A002611 implements Sequence {

  private final MemorySequence mTheta = MemorySequence.cachedSequence(new A002288());
  private final MemorySequence mE = MemorySequence.cachedSequence(new A004018());
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; 2 * k <= mN; ++k) {
      sum = sum.add(mE.a(mN - 2 * k).multiply(mTheta.a(k)));
    }
    return sum;
  }
}
