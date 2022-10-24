package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.transform.DikTransformSequence;

/**
 * A032292 Number of series-reduced dyslexic planted compound windmills with n leaves.
 * @author Sean A. Irvine
 */
public class A032292 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    add(Z.ZERO);
    final Sequence s = new DikTransformSequence(toFiniteSequence(), 0);
    for (int k = 0; k < size(); ++k) {
      s.next();
    }
    remove(size() - 1);
    return s.next();
  }
}
