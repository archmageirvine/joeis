package irvine.oeis.a007;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007629 Keith numbers, or Repfigit (REPlicating FIbonnaci diGIT) numbers.
 * @author Sean A. Irvine
 */
public class A007629 extends Sequence1 {

  private Z mN = Z.TEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Predicates.KEITH.is(mN)) {
        return mN;
      }
    }
  }
}
