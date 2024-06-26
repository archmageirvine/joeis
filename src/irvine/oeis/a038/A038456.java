package irvine.oeis.a038;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038456 List of pairs of consecutive numbers each with 4 divisors (duplicates removed).
 * @author Sean A. Irvine
 */
public class A038456 extends Sequence1 {

  private boolean mWas = false;
  private boolean mQueue = false;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.FOUR.equals(Functions.SIGMA0.z(++mN))) {
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
