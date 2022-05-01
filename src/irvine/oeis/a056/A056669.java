package irvine.oeis.a056;

import irvine.math.polynomial.ExtendedSymmetricGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056668.
 * @author Sean A. Irvine
 */
public class A056669 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    return ExtendedSymmetricGroupCycleIndex.extendedSymmetricGroupCycleIndex(3, ++mN).eval(mN).toZ();
  }
}
