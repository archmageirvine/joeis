package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.transform.InverseBinomialTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A010747 Shifts 6 places left under inverse binomial transform.
 * @author Sean A. Irvine
 */
public class A010747 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 6) {
      return Z.valueOf(1L << size());
    } else {
      return InverseBinomialTransformSequence.inverseBinomial(this, size() - 5);
    }
  }
}
