package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A010743 Shifts 4 places left under inverse binomial transform.
 * @author Sean A. Irvine
 */
public class A010743 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 4) {
      return Z.valueOf(1L << size());
    } else {
      return InverseBinomialTransformSequence.inverseBinomial(toList(), size() - 3);
    }
  }
}
