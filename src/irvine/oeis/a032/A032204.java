package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.CycleTransformSequence;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;

/**
 * A032204 Number of series-reduced planted compound windmills with n leaves of 2 colors.
 * @author Sean A. Irvine
 */
public class A032204 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 1) {
      return Z.TWO;
    }
    add(Z.ZERO); // placeholder
    final CycleTransformSequence cts = new CycleTransformSequence(new FiniteSequence(this), 0);
    remove(n);
    for (int k = 0; k <= n; ++k) {
      cts.next();
    }
    return cts.next();
  }
}
