package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069282 Numbers n such that phi(reversal(n)) = reversal(phi(n)). Ignore leading 0's.
 * @author Sean A. Irvine
 */
public class A069282 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phi(Functions.REVERSE.l(++mN)).equals(Functions.REVERSE.z(Euler.phi(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
