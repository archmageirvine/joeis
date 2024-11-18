package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073105 Least k such that there are n primes among the numbers x*2^n + 1 for 1 &lt;= x &lt;= k.
 * @author Sean A. Irvine
 */
public class A073105 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN);
    long cnt = 0;
    long k = 0;
    Z a = Z.ONE;
    while (true) {
      ++k;
      a = a.add(t);
      if (a.isProbablePrime() && ++cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}
