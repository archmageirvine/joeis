package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a008.A008284;

/**
 * A039808 Shifts left under transform T where Ta is product of Partition Triangle A008284 with a.
 * @author Sean A. Irvine
 */
public class A039808 extends MemorySequence {

  {
    setOffset(1);
  }

  private final Sequence mPartTriangle = new A008284();

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(a(k).multiply(mPartTriangle.next()));
    }
    return sum;
  }

}
