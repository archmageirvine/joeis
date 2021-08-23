package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A051025 Primes p for which pi_{4,3}(p) - pi_{4,1}(p) = -1, where pi_{m,a}(x) is the number of primes &lt;= x which are congruent to a (mod m).
 * @author Sean A. Irvine
 */
public class A051025 extends A000040 {

  private long mD = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      mD += p.mod(4) - 2;
      if (mD == -1) {
        return p;
      }
    }
  }
}
