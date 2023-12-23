package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a092.A092113;

/**
 * A058986 Sorting by prefix reversal (or "flipping pancakes"). You can only reverse segments that include the initial term of the current permutation; a(n) is the number of reversals that are needed to transform an arbitrary permutation of n letters to the identity permutation.
 * @author Sean A. Irvine
 */
public class A058986 extends A092113 {

  @Override
  public Z next() {
    step();
    return Z.valueOf(mMax - 1);
  }
}
