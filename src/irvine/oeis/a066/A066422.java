package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066422 a(n) = least k such that phi^(k)(n) + 1 is prime, where phi^(k) denotes application of phi k times.
 * @author Sean A. Irvine
 */
public class A066422 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long k = 0;
    Z t = mN;
    while (true) {
      ++k;
      t = Euler.phi(t);
      if (t.add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
