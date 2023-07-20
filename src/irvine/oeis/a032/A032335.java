package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.ChjTransformSequence;

/**
 * A032335 Shifts left 2 places under "CHJ" (necklace, identity, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032335 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    return ChjTransformSequence.chj(toList()).get(n - 2);
  }
}
