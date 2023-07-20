package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.CycleTransformSequence;

/**
 * A032201 Number of rooted compound windmills with n nodes and leaves of 2 colors.
 * @author Sean A. Irvine
 */
public class A032201 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.TWO;
    }
    final CycleTransformSequence cts = new CycleTransformSequence(toFiniteSequence(), 0);
    for (int k = 0; k < size(); ++k) {
      cts.next();
    }
    return cts.next();
  }
}
