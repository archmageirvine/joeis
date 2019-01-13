package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.InverseBinomialTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A010745.
 * @author Sean A. Irvine
 */
public class A010745 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 5) {
      return Z.valueOf(1L << size());
    } else {
      return InverseBinomialTransformSequence.inverseBinomial(this, size() - 4);
    }
  }
}
