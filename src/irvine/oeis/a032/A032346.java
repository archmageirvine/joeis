package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.InverseBinomialTransformSequence;
import irvine.oeis.MemorySequence;

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
    final Z t = InverseBinomialTransformSequence.inverseBinomial(this, n + 1);
    remove(n);
    return get(n - 1).subtract(t);
  }
}
