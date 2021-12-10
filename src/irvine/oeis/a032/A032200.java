package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.transform.CycleTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;

/**
 * A032200 Number of rooted compound windmills (mobiles) of n nodes.
 * @author Sean A. Irvine
 */
public class A032200 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() < 2) {
      return Z.ONE;
    }
    final CycleTransformSequence cts = new CycleTransformSequence(new FiniteSequence(this), 0);
    for (int k = 0; k < size(); ++k) {
      cts.next();
    }
    return cts.next();
  }
}
