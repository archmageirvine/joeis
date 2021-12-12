package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.transform.EulerTransform;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;

/**
 * A038072 Shifts left under Euler transform.
 * @author Sean A. Irvine
 */
public class A038072 extends MemorySequence {

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.NEG_ONE;
    }
    final EulerTransform et = new EulerTransform(new FiniteSequence(this));
    for (int k = 1; k < size(); ++k) {
      et.next();
    }
    return et.next();
  }
}
