package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051024 Values of n for which pi_{4,3}(p_n) - pi_{4,1}(p_n) = -1, where p_n is the n-th prime and pi_{m,a}(x) is the number of primes &lt;= x which are congruent to a (mod m).
 * @author Sean A. Irvine
 */
public class A051024 extends A000040 {

  private long mN = 0;
  private long mD = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mD += super.next().mod(4) - 2;
      if (mD == -1) {
        return Z.valueOf(mN);
      }
    }
  }
}
