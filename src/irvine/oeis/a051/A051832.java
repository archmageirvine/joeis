package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051832 Numbers n such that (2*10^(5*n) - 10^(4*n) + 2*10^(3*n) + 10^(2*n) + 10^n + 1)/3 is prime.
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
