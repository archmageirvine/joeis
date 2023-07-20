package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.BhjTransformSequence;

/**
 * A032083 Shifts left 2 places under "BHJ" (reversible, identity, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032083 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 4) {
      return Z.ONE;
    }
    return BhjTransformSequence.bhj(toList()).get(n - 2);
  }
}
