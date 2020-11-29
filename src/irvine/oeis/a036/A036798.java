package irvine.oeis.a036;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036798 Odd n such that there exists an even number k &lt; n with phi(k) = phi(n).
 * @author Sean A. Irvine
 */
public class A036798 implements Sequence {

  private Z mN = Z.valueOf(103);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z phi = Euler.phi(mN);
      for (final Z k : Euler.inversePhi(phi)) {
        if (k.isEven() && k.compareTo(mN) < 0) {
          return mN;
        }
      }
    }
  }
}
