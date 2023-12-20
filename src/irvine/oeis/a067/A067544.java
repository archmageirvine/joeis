package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067544 Numbers k such that phi(k*(k+1)*(k+2)/6)/phi(k*(k+1)/2) is not an integer where phi(k) = A000010(k) is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A067544 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z a = n.multiply(mN + 1).divide2();
      if (!Euler.phi(a.multiply(mN + 2).divide(3)).mod(Euler.phi(a)).isZero()) {
        return n;
      }
    }
  }
}
