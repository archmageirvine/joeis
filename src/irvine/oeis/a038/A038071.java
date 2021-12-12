package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.transform.InverseEulerTransform;
import irvine.oeis.MemorySequence;

/**
 * A038071 Shifts left under inverse Euler transform.
 * @author Sean A. Irvine
 */
public class A038071 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    final InverseEulerTransform iet = new InverseEulerTransform(new FiniteSequence(this));
    for (int k = 1; k < size(); ++k) {
      iet.next();
    }
    return iet.next();
  }
}
