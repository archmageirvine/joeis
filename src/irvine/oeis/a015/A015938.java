package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015938 Smallest <code>k&gt;2^n</code> such that <code>2^k == 2^n (mod k)</code>.
 * @author Sean A. Irvine
 */
public class A015938 implements Sequence {

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
