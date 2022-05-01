package irvine.oeis.a001;

import irvine.math.polynomial.ExtendedSymmetricGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001322 Number of equivalence classes of n-valued Post functions of 2 variables under action of symmetric group S_2.
 * @author Sean A. Irvine
 */
public class A001322 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return ExtendedSymmetricGroupCycleIndex.extendedSymmetricGroupCycleIndex(2, ++mN).eval(mN).toZ();
  }
}
