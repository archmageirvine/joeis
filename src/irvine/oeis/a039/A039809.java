package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a008.A008284;

/**
 * A039809.
 * @author Sean A. Irvine
 */
public class A039809 extends MemorySequence {

  private final Sequence mPartTriangle = new SkipSequence(new A008284(), 1);

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < n; ++k) {
      sum = sum.add(get(k).multiply(mPartTriangle.next()));
    }
    mPartTriangle.next(); // skip last value in row
    return sum;
  }

}
