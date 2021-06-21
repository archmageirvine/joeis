package irvine.oeis.a245;
// manually 2021-06-21

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A245366 a(n) = 1 + a(n-1) * (a(n-2) - 1) * (a(n-3) - 1) with a(0) = 1, a(1) = 2, a(2) = 3, a(3) = 4.
 * @author Georg Fischer
 */

public class A245366 implements Sequence {
    
  protected int mN = -1;
  protected Z[] mA = {Z.ONE, Z.TWO, Z.THREE, Z.FOUR};
  private final int mRecl = mA.length;
  
  @Override
  public Z next() {
    ++mN;
    final int n = mN % mRecl;
    if (mN >= mRecl) {
      mA[n] = Z.ONE.add(mA[(mN - 1) % mRecl]
          .multiply(mA[(mN - 2) % mRecl].subtract(Z.ONE))
          .multiply(mA[(mN - 3) % mRecl].subtract(Z.ONE)));
    }
    return mA[n];
  }
}
