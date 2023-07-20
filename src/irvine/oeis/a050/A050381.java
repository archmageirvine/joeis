package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.EulerTransformUtils;

/**
 * A050381 Number of series-reduced planted trees with n leaves of 2 colors.
 * @author Sean A. Irvine
 */
public class A050381 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 0) {
      return Z.TWO;
    }
    return EulerTransformUtils.eulerTransform(toList(), n + 1);
  }
}
