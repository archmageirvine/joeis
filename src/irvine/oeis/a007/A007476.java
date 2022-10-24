package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.BinomialTransformSequence;

/**
 * A007476 Shifts 2 places left under binomial transform.
 * @author Sean A. Irvine
 */
public class A007476 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.ONE;
    } else {
      return BinomialTransformSequence.binomial(toList(), size() - 1);
    }
  }
}
