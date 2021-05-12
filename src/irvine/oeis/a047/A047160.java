package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047160 For n &gt;= 2, a(n) = smallest number m &gt;= 0 such that n-m and n+m are both primes, or -1 if no such m exists.
 * @author Sean A. Irvine
 */
public class A047160 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    long m = -1;
    while (true) {
      if (mN.add(++m).isProbablePrime() && mN.subtract(m).isProbablePrime()) {
        return Z.valueOf(m);
      }
    }
  }
}
