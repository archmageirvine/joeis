package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A075703 a(n) = maximal m such that Sum_{k=n..m} prime(k) &lt;= prime(n)*prime(m).
 * @author Sean A. Irvine
 */
public class A075703 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    ++mN;
    Z sum = p;
    long m = mN;
    Z q = p;
    while (true) {
      q = mPrime.nextPrime(q);
      sum = sum.add(q);
      if (sum.compareTo(p.multiply(q)) > 0) {
        return Z.valueOf(m);
      }
      ++m;
    }
  }
}
