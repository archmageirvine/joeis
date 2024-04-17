package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063484 Omega(n+1) = 2*Omega(n), where Omega(n) is the number of prime divisors of n (with repetition).
 * @author Sean A. Irvine
 */
public class A063484 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (2 * Functions.BIG_OMEGA.l(++mN) == Functions.BIG_OMEGA.l(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
