package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A053976 Least number such that a(n) and nextprime(a(n)) differ by at least a power of 10, 10^m, where m &gt;= n.
 * @author Sean A. Irvine
 */
public class A053976 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mT = 0;

  @Override
  public Z next() {
    mT = mT == 0 ? 1 : mT * 10;
    long p = 2;
    long q;
    while ((q = mPrime.nextPrime(p)) - p < mT) {
      p = q;
    }
    return Z.valueOf(p);
  }
}
