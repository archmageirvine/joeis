package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A050200 Let p = prime(n). Then a(n) = p + (next prime &gt;= p+1) + (next prime &gt;= p+3).
 * @author Sean A. Irvine
 */
public class A050200 extends A000040 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final Z p = super.next();
    return p.add(mPrime.nextPrime(p)).add(mPrime.nextPrime(p.add(2)));
  }
}
