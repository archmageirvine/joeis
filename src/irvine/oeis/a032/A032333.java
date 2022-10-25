package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.ChjTransformSequence;

/**
 * A032333 Shifts left under "CHJ" (necklace, identity, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032333 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    return ChjTransformSequence.chj(toList()).get(n - 1);
  }
}
