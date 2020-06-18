package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.ChjTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A032336 Doubles (index <code>2+)</code> under "CHJ" <code>(necklace</code>, identity, labeled) transform.
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
    final Z t = ChjTransformSequence.chj(this).get(n);
    remove(n);
    return t;
  }
}
