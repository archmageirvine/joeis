package irvine.oeis.a056;

import irvine.math.polynomial.ExtendedSymmetricGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056668.
 * @author Sean A. Irvine
 */
public class A056668 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return ExtendedSymmetricGroupCycleIndex.extendedSymmetricGroupCycleIndex(++mN, 4).eval(4).toZ();
  }
}
