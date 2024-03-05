package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068676 Primes formed by the concatenation 1, n, n^2, n, 1.
 * @author Sean A. Irvine
 */
public class A068676 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z("1" + ++mN + mN * mN + mN + "1");
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
