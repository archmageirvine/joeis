package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002212;

/**
 * A039660 Related to enumeration of edge-rooted catafusenes.
 * @author Sean A. Irvine
 */
public class A039660 extends Sequence1 {

  private final MemorySequence mA = MemorySequence.cachedSequence(new A002212());
  private final MemorySequence mL = MemorySequence.cachedSequence(new PrependSequence(new A039658(), 0));
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= (mN - 2) / 2; ++k) {
      sum = sum.add(mA.a(k).multiply(mL.a(mN - 2 * k)));
    }
    return sum;
  }
}
