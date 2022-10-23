package irvine.oeis.a056;

import irvine.math.polynomial.ExtendedSymmetricGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A056669 Number of equivalence classes of n-valued Post functions of 3 variables under action of symmetric group S_3.
 * @author Sean A. Irvine
 */
public class A056669 extends Sequence2 {

  private int mN = 1;

  @Override
  public Z next() {
    return ExtendedSymmetricGroupCycleIndex.extendedSymmetricGroupCycleIndex(3, ++mN).eval(mN).toZ();
  }
}
