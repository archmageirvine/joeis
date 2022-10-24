package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.BhjTransformSequence;

/**
 * A032081 Shifts left under "BHJ" (reversible, identity, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032081 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    return BhjTransformSequence.bhj(toList()).get(n - 1);
  }
}
