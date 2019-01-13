package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015938.
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
