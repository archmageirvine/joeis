package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082673 a(n) is the least k &gt;= n such that k!/n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A082673 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    Z f = mF; // n! / n = (n-1)!
    long k = mN;
    mF = mF.multiply(++mN);
    while (true) {
      if (++k != mN) {
        f = f.multiply(k); // f = k! / n
      }
      if (f.add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
