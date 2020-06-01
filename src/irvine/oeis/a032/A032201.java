package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.CycleTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;

/**
 * A032201 Number of rooted compound windmills with n nodes and leaves of 2 colors.
 * @author Sean A. Irvine
 */
public class A032201 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.TWO;
    }
    final CycleTransformSequence cts = new CycleTransformSequence(new FiniteSequence(this), 0);
    for (int k = 0; k < size(); ++k) {
      cts.next();
    }
    return cts.next();
  }
}
