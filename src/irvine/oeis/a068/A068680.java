package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068680 Primes formed by the concatenation n, n+2, n.
 * @author Sean A. Irvine
 */
public class A068680 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z(String.valueOf(++mN) + (mN + 2) + mN);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
