package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.transform.ChjTransformSequence;

/**
 * A032336 Doubles (index 2+) under "CHJ" (necklace, identity, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032336 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.TWO;
    }
    add(Z.ZERO);
    final Z t = ChjTransformSequence.chj(toList()).get(n);
    remove(n);
    return t;
  }
}
