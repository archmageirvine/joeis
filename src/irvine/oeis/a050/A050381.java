package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.EulerTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A050381 Number of series-reduced planted trees with n leaves of 2 colors.
 * @author Sean A. Irvine
 */
public class A050381 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.TWO;
    }
    return EulerTransformSequence.eulerTransform(this, n + 1);
  }
}
