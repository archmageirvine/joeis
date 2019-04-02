package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004004 a(n) = (3^{2n+1} - 8*n - 3)/16.
 * @author Sean A. Irvine
 */
public class A004004 extends MemorySequence {

  private long mN = 5;
  private Z mT = null;

  @Override
  protected Z computeNext() {
    mT = mT == null ? Z.THREE : mT.multiply(9);
    mN -= 8;
    return mT.add(mN).shiftRight(4);
  }
}

