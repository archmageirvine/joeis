package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032307 Shifts left 2 places under "EFK" (unordered, size, unlabeled) transform.
 * @author Sean A. Irvine
 */
public class A032307 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    if (size() <= 3) {
      return Z.ONE;
    }
    return A032306.efk(this).coeff(size() - 2);
  }
}
