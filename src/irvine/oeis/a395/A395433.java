package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A395433 allocated for Ya-Ping Lu.
 * @author Sean A. Irvine
 */
public class A395433 extends Sequence2 {

  private long mP = 3;
  private long mN = 2;
  private long mPi2N = 0;
  private long mQ = 2;
  private long mPiN = 0;

  @Override
  public Z next() {
    mN += 2;
    while (mP < mN) {
      ++mPi2N;
      mP = Functions.NEXT_PRIME.l(mP);
    }
    while (2 * mPiN < mPi2N) {
      ++mPiN;
      mQ = Functions.NEXT_PRIME.l(mQ);
    }
    return (mPi2N & 1) == 1 ? Z.valueOf(mQ) : Z.valueOf((mQ + Functions.NEXT_PRIME.l(mQ)) / 2);
  }
}
