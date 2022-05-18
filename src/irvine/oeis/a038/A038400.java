package irvine.oeis.a038;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038400 List of pairs of consecutive numbers each with 6 divisors (duplicates removed).
 * @author Sean A. Irvine
 */
public class A038400 implements Sequence {

  private boolean mWas = false;
  private boolean mQueue = false;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.SIX.equals(Jaguar.factor(++mN).sigma0())) {
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
