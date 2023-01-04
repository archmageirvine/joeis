package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060802 To weigh from 1 to n, make the heaviest weight as small as possible, under the condition of using fewest pieces of different, single weights; a(n) = weight of the heaviest weight.
 * @author Sean A. Irvine
 */
public class A060802 extends Sequence1 {

  private static final int[] SMALL = {0, 1, 2, 2, 3, 3, 3, 4};
  private long mN = 0;
  private long mT = 8;
  private long mU = 12;
  private long mM = 0;
  private long mC = 0;

  @Override
  public Z next() {
    if (++mN < SMALL.length) {
      return Z.valueOf(SMALL[(int) mN]);
    } else if (mN == mT) {
      mM = (mN >>> 2) + 2;
      mU = mT + mT / 2;
      mT *= 2;
      mC = 2;
      return Z.valueOf(mM);
    } else if (mC > 0) {
      --mC;
      return Z.valueOf(mM);
    } else {
      ++mM;
      mC = mN >= mU ? 0 : 1;
      return Z.valueOf(mM);
    }
  }
}
