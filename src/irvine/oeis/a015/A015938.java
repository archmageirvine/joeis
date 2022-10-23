package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015938 Smallest k&gt;2^n such that 2^k == 2^n (mod k).
 * @author Sean A. Irvine
 */
public class A015938 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z k = Z.ONE.shiftLeft(++mN);
    final Z n = Z.valueOf(mN);
    while (true) {
      k = k.add(1);
      if (Z.TWO.modPow(k, k).equals(Z.TWO.modPow(n, k))) {
        return k;
      }
    }
  }
}
