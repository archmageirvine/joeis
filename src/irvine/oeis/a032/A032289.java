package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.transform.DikTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;

/**
 * A032289 Number of dyslexic rooted compound windmills with n nodes.
 * @author Sean A. Irvine
 */
public class A032289 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final Sequence s = new DikTransformSequence(new FiniteSequence(this), 0);
    for (int k = 0; k < size(); ++k) {
      s.next();
    }
    return s.next();
  }
}
