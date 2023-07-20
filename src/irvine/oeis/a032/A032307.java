package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A032307 Shifts left 2 places under "EFK" (unordered, size, unlabeled) transform.
 * @author Sean A. Irvine
 */
public class A032307 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    if (size() <= 3) {
      return Z.ONE;
    }
    return A032306.efk(toList()).coeff(size() - 2);
  }
}
