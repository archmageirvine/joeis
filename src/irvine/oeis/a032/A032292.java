package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.DikTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A032292 Number of series-reduced dyslexic planted compound windmills with n leaves.
 * @author Sean A. Irvine
 */
public class A032292 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    add(Z.ZERO);
    final Sequence s = new DikTransformSequence(new FiniteSequence(this), 0);
    for (int k = 0; k < size(); ++k) {
      s.next();
    }
    remove(size() - 1);
    return s.next();
  }
}
