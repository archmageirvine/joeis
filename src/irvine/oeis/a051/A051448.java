package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051448 Sum of prime divisors of n (with multiplicity) is a square.
 * @author Sean A. Irvine
 */
public class A051448 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPFR.z(++mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
