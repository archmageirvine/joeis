package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.BhjTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A032081 Shifts left under "BHJ" <code>(reversible</code>, identity, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032081 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 3) {
      return Z.ONE;
    }
    return BhjTransformSequence.bhj(this).get(n - 1);
  }
}
