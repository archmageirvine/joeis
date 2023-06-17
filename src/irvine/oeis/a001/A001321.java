package irvine.oeis.a001;

import irvine.math.polynomial.ExtendedSymmetricGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001321 Number of equivalence classes of 3-valued Post functions of n variables under action of symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A001321 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return ExtendedSymmetricGroupCycleIndex.extendedSymmetricGroupCycleIndex(mN, 3).eval(3).toZ();
  }
}
