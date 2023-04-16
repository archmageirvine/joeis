package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A292564 Take 1, skip 3 * 1 - 1, take 2, skip 3 * 2 - 1, take 3, skip 3 * 3 - 1, ...
 * 0, 3, 4, 10, 11, 12, 21, 22, 23, 24, 36, 37
 * @author Georg Fischer
 */
public class A292564 extends Sequence0 {

  private long mN = -1;
  private long mS = 0;
  private long mT = 1;

  @Override
  public Z next() {
    if (mT == 0) {
      ++mS;
      mN += 3 * mS - 1;
      mT = mS + 1;
    }
    --mT;
    return Z.valueOf(++mN);
  }
}
