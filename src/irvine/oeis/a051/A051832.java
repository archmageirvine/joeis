package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051832 Numbers k such that (2*10^(5*k) - 10^(4*k) + 2*10^(3*k) + 10^(2*k) + 10^k + 1)/3 is prime.
 * @author Sean A. Irvine
 */
public class A051832 extends Sequence1 {

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z u = Z.TEN.pow(++mN);
      final Z u2 = u.square();
      final Z u4 = u2.square();
      final Z t = Z.ONE.add(u).add(u2).add(u2.multiply(u).multiply2()).subtract(u4).add(u4.multiply(u).multiply2());
      if (t.divide(3).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
