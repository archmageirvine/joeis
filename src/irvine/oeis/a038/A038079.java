package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A038079 Number of rooted identity trees with 3-colored nodes.
 * @author Sean A. Irvine
 */
public class A038079 extends MemorySequence {

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
    return wt.next().multiply(3);
  }
}
