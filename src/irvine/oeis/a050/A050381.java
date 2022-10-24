package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.EulerTransformSequence;

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
    return EulerTransformSequence.eulerTransform(toList(), n + 1);
  }
}
