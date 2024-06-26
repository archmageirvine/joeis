package irvine.oeis.a026;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A026424 Number of prime divisors (counted with multiplicity) is odd; Liouville function lambda(n) (A008836) is negative.
 * @author Sean A. Irvine
 */
public class A026424 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if ((Functions.BIG_OMEGA.l(++mN) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
