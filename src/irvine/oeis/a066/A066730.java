package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000961;
import irvine.oeis.memory.MemorySequence;

/**
 * A036839.
 * @author Sean A. Irvine
 */
public class A066730 extends Sequence1 {

  private Z mN = Z.ONE;
  private int mMax = 0;
  private final MemorySequence mA = MemorySequence.cachedSequence(new A000961().skip());

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (!mN.isSquare()) {
        int u = 0;
        while (ZUtils.isQuadraticResidue(mN, mA.a(u))) {
          ++u;
        }
        if (u > mMax) {
          mMax = u;
          return mN;
        }
      }
    }
  }
}
