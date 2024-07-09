package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071249 Numbers k such that gcd(k, R(k)) &gt; 1, where R(k) (A004086) is the digit reversal of k.
 * @author Sean A. Irvine
 */
public class A071249 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.GCD.l(++mN, Functions.REVERSE.l(mN)) > 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
