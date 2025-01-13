package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A074126 Group the composite numbers so that the sum of the n-th group is a multiple of the n-th prime: (4), (6), (8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22), (24, 25), (26, 27, 28, 30, 32), (33, 34, ...), ... Sequence gives the number of terms in each group.
 * @author Sean A. Irvine
 */
public class A074126 extends A002808 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    Z sum = Z.ZERO;
    long cnt = 0;
    do {
      ++cnt;
      sum = sum.add(super.next());
    } while (sum.mod(mP) != 0);
    return Z.valueOf(cnt);
  }
}
