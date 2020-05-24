package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.BhjTransformSequence;
import irvine.oeis.MemorySequence;

/**
 * A032084 Doubles (index <code>2+)</code> under "BHJ" <code>(reversible</code>, identity, labeled) transform.
 * @author Sean A. Irvine
 */
public class A032084 extends MemorySequence {

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < 2) {
      return Z.TWO;
    }
    add(Z.ZERO);
    final Z t = BhjTransformSequence.bhj(this).get(n);
    remove(n);
    return t;
  }
}
