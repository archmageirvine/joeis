package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.InverseBinomialTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A010739.
 * @author Sean A. Irvine
 */
public class A010739 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.valueOf(size() + 1);
    } else {
      return InverseBinomialTransformSequence.inverseBinomial(this, size() - 1);
    }
  }
}
