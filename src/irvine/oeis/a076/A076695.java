package irvine.oeis.a076;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076600.
 * @author Sean A. Irvine
 */
public class A076695 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 11;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long r = mP % 12;
    if (r == 1) {
      return Z.valueOf((mP - 13)/ 12);
    }
    if (r == 5) {
      return Z.valueOf((mP - 5) / 12);
    }
    if (r == 7) {
      return Z.valueOf((mP - 7)/ 12);
    }
    if (r == 11) {
      return Z.valueOf((mP + 1) / 12);
    }
    throw new RuntimeException(); // impossible
  }
}
