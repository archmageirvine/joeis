package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.BhjTransformSequence;

/**
 * A032082 Shifts left under "BHJ" (reversible, identity, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032082 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.TWO;
    }
    return BhjTransformSequence.bhj(toList()).get(n - 1);
  }
}
