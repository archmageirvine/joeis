package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A038072 Shifts left under Euler transform.
 * @author Sean A. Irvine
 */
public class A038072 extends MemorySequence {

  {
    setOffset(1);
  }

  @Override
  protected Z computeNext() {
    if (size() == 0) {
      return Z.NEG_ONE;
    }
    final EulerTransform et = new EulerTransform(toFiniteSequence());
    for (int k = 1; k < size(); ++k) {
      et.next();
    }
    return et.next();
  }
}
