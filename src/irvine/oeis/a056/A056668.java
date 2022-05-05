package irvine.oeis.a056;

import irvine.math.polynomial.ExtendedSymmetricGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056668 Number of equivalence classes of 4-valued Post functions of n variables under action of symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A056668 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return ExtendedSymmetricGroupCycleIndex.extendedSymmetricGroupCycleIndex(++mN, 4).eval(4).toZ();
  }
}
