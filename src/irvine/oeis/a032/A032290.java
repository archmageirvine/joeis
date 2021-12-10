package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.transform.DikTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A032290 Number of dyslexic rooted compound windmills with n nodes and leaves of 2 colors.
 * @author Sean A. Irvine
 */
public class A032290 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.TWO;
    }
    final Sequence s = new DikTransformSequence(new FiniteSequence(this), 0);
    for (int k = 0; k < size(); ++k) {
      s.next();
    }
    return s.next();
  }
}
