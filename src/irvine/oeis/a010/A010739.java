package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A010739 Shifts 2 places left under inverse binomial transform.
 * @author Sean A. Irvine
 */
public class A010739 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.valueOf(size() + 1);
    } else {
      return InverseBinomialTransformSequence.inverseBinomial(toList(), size() - 1);
    }
  }
}
