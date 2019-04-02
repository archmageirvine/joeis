package irvine.oeis.a001;

import irvine.math.polynomial.ExtendedSymmetricGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001321 Number of Post functions.
 * @author Sean A. Irvine
 */
public class A001321 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return ExtendedSymmetricGroupCycleIndex.extendedSymmetricGroupCycleIndex(mN, 3).eval(3).toZ();
  }
}
