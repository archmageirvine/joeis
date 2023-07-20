package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.CycleTransformSequence;

/**
 * A032203 Number of series-reduced planted compound windmills with n leaves.
 * @author Sean A. Irvine
 */
public class A032203 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.ONE;
    }
    add(Z.ZERO); // placeholder
    final CycleTransformSequence cts = new CycleTransformSequence(toFiniteSequence(), 0);
    remove(n);
    for (int k = 0; k <= n; ++k) {
      cts.next();
    }
    return cts.next();
  }
}
