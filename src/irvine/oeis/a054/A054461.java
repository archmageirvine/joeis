package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054461 Primes of the form (k+1)^k + k^(k-1), k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A054461 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN + 1).pow(mN).add(Z.valueOf(mN).pow(mN - 1));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
