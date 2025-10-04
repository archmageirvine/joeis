package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080842 Numbers in the x/3 + 1 conjecture: Repeat until 1 is reached: if x is divisible by 3 then divide by 3, otherwise add 1.
 * @author Sean A. Irvine
 */
public class A080842 extends Sequence1 {

  private long mN = 1;
  private long mM = 2;

  @Override
  public Z next() {
    if (mN == 1) {
      ++mN;
      return Z.ONE;
    }
    if (mM == 1) {
      mM = ++mN;
    }
    mM = mM % 3 == 0 ? mM / 3 : mM + 1;
    return Z.valueOf(mM);
  }
}

