package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.CycleTransformSequence;

/**
 * A032200 Number of rooted compound windmills (mobiles) of n nodes.
 * @author Sean A. Irvine
 */
public class A032200 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.ONE;
    }
    final CycleTransformSequence cts = new CycleTransformSequence(toFiniteSequence(), 0);
    for (int k = 0; k < size(); ++k) {
      cts.next();
    }
    return cts.next();
  }
}
