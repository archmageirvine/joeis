package irvine.oeis.a292;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A292611 Skip 3 triangle numbers, take 1 triangle number, skip 4 triangle numbers, take 2 triangle numbers, skip 5 triangle numbers, take 3 triangle numbers, ...
 * @author Georg Fischer
 */
public class A292611 extends Sequence1 {

  private long mN = 3;
  private long mS = 3;
  private long mT = 1;

  @Override
  public Z next() {
    if (mT == 0) {
      ++mS;
      mN += mS;
      mT = mS - 2;
    }
    --mT;
    ++mN;
    return Z.valueOf(mN * (mN + 1) / 2);
  }
}
