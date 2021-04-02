package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a001.A001221;

/**
 * A046072 Decompose multiplicative group of integers modulo n as a product of cyclic groups C_{k_1} x C_{k_2} x ... x C_{k_m}, where k_i divides k_j for i &lt; j; then a(n) = m.
 * @author Sean A. Irvine
 */
public class A046072 extends A001221 {

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN <= 2) {
      return Z.ONE;
    }
    if ((mN & 7) == 0) {
      return t.add(1);
    } else if ((mN & 3) == 2) {
      return t.subtract(1);
    } else {
      return t;
    }
  }
}
