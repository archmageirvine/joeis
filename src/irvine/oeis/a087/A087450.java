
package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A087450 Smallest number (see comment for representation) with all identical digits having n distinct prime divisors.
 * @author Sean A. Irvine
 */
public class A087450 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z r = Z.ZERO;
    for (int k = 1; ; ++k) {
      r = r.multiply(10).add(1);
      for (int j = 1; j <= 9; ++j) {
        final Z t = r.multiply(j);
        final int omega = Functions.OMEGA.i(t);
        if (omega == mN) {
          return Z.valueOf(10L * k + j);
        }
      }
    }
  }
}
