package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A002141 Class numbers of quadratic fields.
 * @author Sean A. Irvine
 */
public class A002141 extends Sequence3 {

  private final Fast mPrime = new Fast();
  private long mNp = 3;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      long q = 2;
      boolean ok = true;
      for (int k = 0; k < mN; ++k) {
        q = mPrime.nextPrime(q);
        if (Functions.JACOBI.i(mNp, q) != -Functions.JACOBI.i(-1, q)) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(LongUtils.hurwitzClassNumber(-mNp));
      }
      do {
        mNp += 2;
      } while ((mNp & 7) != 7);
    }
  }
}
