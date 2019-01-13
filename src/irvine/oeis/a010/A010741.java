package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.InverseBinomialTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A010741.
 * @author Sean A. Irvine
 */
public class A010741 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 3) {
      return Z.valueOf(1L << size());
    } else {
      return InverseBinomialTransformSequence.inverseBinomial(this, size() - 2);
    }
  }
}
