package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a098.A098415;

/**
 * A055737 Number of prime triples &lt; 10^n, where a prime triple means 3 successive primes of the form {p, p+2, p+4} or {p, p+4, p+6}.
 * @author Sean A. Irvine
 */
public class A055737 extends A098415 {

  private long mLimit = 1;
  private long mCount = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    mLimit *= 10;
    while (mA.longValueExact() <= mLimit) {
      ++mCount;
      mA = super.next();
    }
    return Z.valueOf(mCount);
  }
}
