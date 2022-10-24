package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006456 Number of compositions (ordered partitions) of n into squares.
 * @author Sean A. Irvine
 */
public class A006456 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k * k <= size(); ++k) {
      sum = sum.add(get(size() - k * k));
    }
    return sum;
  }
}
