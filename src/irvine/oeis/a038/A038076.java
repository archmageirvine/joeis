package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A038076 Number of rooted identity trees with 3-colored leaves.
 * @author Sean A. Irvine
 */
public class A038076 extends MemorySequence {

  {
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    if (size() == 1) {
      return Z.THREE;
    }
    final WeighTransformSequence wt = new WeighTransformSequence(new FiniteSequence(this));
    for (int k = 1; k < size(); ++k) {
      wt.next();
    }
    return wt.next();
  }
}
