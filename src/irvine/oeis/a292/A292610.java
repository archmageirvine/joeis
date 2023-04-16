package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A292610 Take 3 triangle numbers, skip 1 triangle number, take 4 triangle numbers, skip 2 triangle numbers, take 5 triangle numbers, skip 3 triangle numbers, ...
 * @author Georg Fischer
 */
public class A292610 extends Sequence1 {

  private long mN = 0;
  private long mS = 0;
  private long mT = 3;

  @Override
  public Z next() {
    if (mT == 0) {
      ++mS;
      mN += mS;
      mT = mS + 3;
    }
    --mT;
    ++mN;
    return Z.valueOf(mN * (mN + 1) / 2);
  }
}
