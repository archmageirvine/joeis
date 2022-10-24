package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A038071 Shifts left under inverse Euler transform.
 * @author Sean A. Irvine
 */
public class A038071 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.ONE;
    }
    final InverseEulerTransform iet = new InverseEulerTransform(toFiniteSequence());
    for (int k = 1; k < size(); ++k) {
      iet.next();
    }
    return iet.next();
  }
}
