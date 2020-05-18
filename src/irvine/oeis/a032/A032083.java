package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.BhjTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A032083.
 * @author Sean A. Irvine
 */
public class A032083 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 4) {
      return Z.ONE;
    }
    return BhjTransformSequence.bhj(this).get(n - 2);
  }
}
