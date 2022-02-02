package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054403 Result of third stage of sieve of Eratosthenes (after eliminating multiples of 2, 3 and 5).
 * @author Sean A. Irvine
 */
public class A054403 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    if (mN < 5) {
      ++mN;
      if (mN == 4) {
        ++mN;
      }
      return Z.valueOf(mN);
    }
    while (true) {
      mN += 2;
      if (mN % 3 == 0) {
        mN += 2;
      }
      if (mN % 5 != 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
