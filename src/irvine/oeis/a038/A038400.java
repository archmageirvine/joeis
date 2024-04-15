package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038400 List of pairs of consecutive numbers each with 6 divisors (duplicates removed).
 * @author Sean A. Irvine
 */
public class A038400 extends Sequence1 {

  private boolean mWas = false;
  private boolean mQueue = false;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.SIX.equals(Functions.SIGMA0.z(++mN))) {
        if (mWas) {
          mQueue = true;
          return Z.valueOf(mN - 1);
        } else {
          mWas = true;
        }
      } else {
        mWas = false;
        if (mQueue) {
          mQueue = false;
          return Z.valueOf(mN - 1);
        }
      }
    }
  }
}
