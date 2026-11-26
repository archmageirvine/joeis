package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087554 a(n) = smallest number k &gt;= n such that nk + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A087554 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    long k = mN;
    while (true) {
      if (n.multiply(k).add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}
