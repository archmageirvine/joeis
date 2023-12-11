package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.DikTransformSequence;

/**
 * A032289 Number of dyslexic rooted compound windmills with n nodes.
 * @author Sean A. Irvine
 */
public class A032289 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final Sequence s = new DikTransformSequence(toFiniteSequence(), 0);
    for (int k = 0; k < size(); ++k) {
      s.next();
    }
    return s.next();
  }
}
