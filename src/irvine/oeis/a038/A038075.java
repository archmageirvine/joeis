package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A038075 Number of rooted identity trees with 2-colored leaves.
 * @author Sean A. Irvine
 */
public class A038075 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    if (size() == 1) {
      return Z.TWO;
    }
    final WeighTransformSequence wt = new WeighTransformSequence(toFiniteSequence());
    for (int k = 1; k < size(); ++k) {
      wt.next();
    }
    return wt.next();
  }
}
