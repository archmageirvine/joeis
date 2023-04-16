package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A292565 Take 0, skip 3 * 1 + 1, take 1, skip 3 * 2 + 1, take 2, skip 3 * 3 + 1, ...
 * 5, 13, 14, 25, 26, 27, 41, 42, 43
 * @author Georg Fischer
 */
public class A292565 extends Sequence1 {

  private long mN = 4;
  private long mS = 1;
  private long mT = 1;

  @Override
  public Z next() {
    if (mT == 0) {
      ++mS;
      mN += 3 * mS + 1;
      mT = mS;
    }
    --mT;
    return Z.valueOf(++mN);
  }
}
