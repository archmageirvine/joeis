package irvine.oeis.a013;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013584 Smallest m such that 0!+1!+...+(m-1)! is divisible by n, or 0 if no such m exists.
 * @author Sean A. Irvine
 */
public class A013584 extends Sequence1 {

  private int mN = 0;
  private Z mF = Z.ONE;
  private final ArrayList<Z> mFactorialSum = new ArrayList<>();
  {
    mFactorialSum.add(Z.ONE);
  }

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN);
    }
    for (int m = 1; m < mN; ++m) {
      if (m >= mFactorialSum.size()) {
        mF = mF.multiply(m);
        mFactorialSum.add(mFactorialSum.get(mFactorialSum.size() - 1).add(mF));
      }
      if (mFactorialSum.get(m).mod(mN) == 0) {
        return Z.valueOf(m + 1);
      }
    }
    return Z.ZERO;
  }
}
