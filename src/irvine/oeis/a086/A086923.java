package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086923 Primes arising in A086920, or 0 if A086920(n) = 0.
 * @author Sean A. Irvine
 */
public class A086923 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final Z t = new Z(String.valueOf(++k).repeat(mN) + "1");
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
