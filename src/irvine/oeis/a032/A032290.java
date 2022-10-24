package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.transform.DikTransformSequence;

/**
 * A032290 Number of dyslexic rooted compound windmills with n nodes and leaves of 2 colors.
 * @author Sean A. Irvine
 */
public class A032290 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.TWO;
    }
    final Sequence s = new DikTransformSequence(toFiniteSequence(), 0);
    for (int k = 0; k < size(); ++k) {
      s.next();
    }
    return s.next();
  }
}
