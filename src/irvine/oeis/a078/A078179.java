package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A078179 Primes of the form n^k + n - 1, where k&gt;=2 is minimal.
 * @author Sean A. Irvine
 */
public class A078179 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    while (true) {
      n = n.multiply(mN);
      final Z t = n.add(mN - 1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
