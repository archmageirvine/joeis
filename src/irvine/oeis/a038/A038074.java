package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.WeighTransformSequence;

/**
 * A038074 Shifts left and changes sign under Weigh transform.
 * @author Sean A. Irvine
 */
public class A038074 extends MemorySequence {

  {
    setOffset(1);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    if (size() == 1) {
      return Z.ONE;
    }
    final WeighTransformSequence wt = new WeighTransformSequence(toFiniteSequence());
    for (int k = 1; k < size(); ++k) {
      wt.next();
    }
    return wt.next().negate();
  }
}
