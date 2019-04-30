package irvine.oeis.a129;

import irvine.math.group.SymmetricGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.CycleIndexReadBigN;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A129427 Number of isomorphism classes of 3-regular multigraphs of order <code>2n</code>, loops allowed.
 * @author Sean A. Irvine
 */
public class A129427 implements Sequence {

  private static final CycleIndex Z2 = SymmetricGroup.create(2).cycleIndex();
  private static final CycleIndex Z3 = SymmetricGroup.create(3).cycleIndex();
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN == 0) {
      return Z.ONE;
    }
    final CycleIndex a = SymmetricGroup.create(mN).cycleIndex().wreath(Z3);
    final CycleIndex b = SymmetricGroup.create(3 * mN / 2).cycleIndex().wreath(Z2);
    return CycleIndexReadBigN.bigN(a, b).toZ();
  }
}

