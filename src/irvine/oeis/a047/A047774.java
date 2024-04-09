package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001764;
import irvine.oeis.memory.MemorySequence;

/**
 * A047774 Number of chiral pairs of dissectable polyhedra with n tetrahedral cells and symmetry of type C.
 * @author Sean A. Irvine
 */
public class A047774 extends Sequence1 {

  // This could de done without memory of the results, but this is easier

  private int mN = 0;
  private final MemorySequence mD = MemorySequence.cachedSequence(new A047773());
  private final MemorySequence mJ = MemorySequence.cachedSequence(new A047752());
  private final MemorySequence mK = MemorySequence.cachedSequence(new A047751());
  private final MemorySequence mO = MemorySequence.cachedSequence(new A047766());
  private final MemorySequence mQ = MemorySequence.cachedSequence(new A047764());
  private final MemorySequence mU = MemorySequence.cachedSequence(new A047749());
  private final MemorySequence mT = MemorySequence.cachedSequence(new A001764());

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    } else {
      switch (mN % 3) {
        case 1:
          return mT.a((mN - 1) / 3).subtract(mD.a(mN - 1)).divide2();
        case 2:
          return mU.a((2 * mN - 1) / 3)
            .subtract(mD.a(mN - 1).multiply2())
            .subtract(mJ.a(mN - 1).multiply(4))
            .subtract(mK.a(mN - 1).multiply2())
            .subtract(mO.a(mN - 1).multiply(4))
            .subtract(mQ.a(mN - 1))
            .divide(4);
        default:
          return Z.ZERO;
      }
    }
  }
}
