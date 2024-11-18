package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073106 Least k such that there are n primes among the numbers 2*n*x + 1 for 1 &lt;= x &lt;= k.
 * @author Sean A. Irvine
 */
public class A073106 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    long k = 0;
    Z a = Z.ONE;
    while (true) {
      ++k;
      a = a.add(2 * mN);
      if (a.isProbablePrime() && ++cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
