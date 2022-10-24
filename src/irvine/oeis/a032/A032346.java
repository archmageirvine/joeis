package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.InverseBinomialTransformSequence;

/**
 * A032346 Essentially shifts 1 place right under inverse binomial transform.
 * @author Sean A. Irvine
 */
public class A032346 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 1) {
      return Z.ONE;
    }
    add(Z.ZERO);
    final Z t = InverseBinomialTransformSequence.inverseBinomial(toList(), n + 1);
    remove(n);
    return get(n - 1).subtract(t);
  }
}
