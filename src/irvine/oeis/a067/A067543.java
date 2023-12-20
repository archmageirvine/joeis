package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067543 Numbers k such that phi(k*(k+1)*(k+2)*(k+3)/4!)/phi(k*(k+1)*(k+2)/3!) is not an integer where phi(n) = A000010(n) is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A067543 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z a = n.multiply(mN + 1).multiply(mN + 2).divide(6);
      if (!Euler.phi(a.multiply(mN + 3).divide(4)).mod(Euler.phi(a)).isZero()) {
        return n;
      }
    }
  }
}
