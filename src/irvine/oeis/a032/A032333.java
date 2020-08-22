package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.ChjTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A032333 Shifts left under "CHJ" (necklace, identity, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032333 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    return ChjTransformSequence.chj(this).get(n - 1);
  }
}
