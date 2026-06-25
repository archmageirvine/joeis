package irvine.oeis.a129;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.CycleIndexReadBigN;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A129429 Number of isomorphism classes of 4-regular multigraphs of order n, loops allowed.
 * @author Sean A. Irvine
 */
public class A129429 extends Sequence1 {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private static final CycleIndex Z4 = SymmetricGroup.create(4).cycleIndex();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final CycleIndex a = SymmetricGroup.create(mN).cycleIndex().wreath(Z4);
    final CycleIndex b = SymmetricGroup.create(2 * mN).cycleIndex().wreath(Z2);
    return CycleIndexReadBigN.bigN(a, b).toZ();
  }
}

