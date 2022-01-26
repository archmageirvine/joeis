package irvine.oeis.a228;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A228933 Optimal ascending continued fraction expansion of phi-1=1/phi=(sqrt(5)-1)/2 .
 * Flatten[{2, 4, RecurrenceTable[{a[n] == a[n-1]^2 - 2, a[3] == -18}, a, {n, 3, 10}]}]
 * @author Georg Fischer
 */
public class A228933 implements Sequence {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A228933() {
    mN = 0;
    mA = Z.valueOf(-18);
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.TWO;
    } else if (mN == 2) {
      return Z.FOUR;
    } else if (mN == 3) {
      return mA;
    }
    mA = mA.square().subtract(2);
    return mA;
  }
}
