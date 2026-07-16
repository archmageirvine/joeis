package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085878 Smallest n-th power k^n == 1 (mod 10^n), where k&gt;1.
 * @author Sean A. Irvine
 */
public class A085878 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z mod = Z.TEN.pow(++mN);
    Z k = Z.ONE;
    while (true) {
      k = k.add(1);
      if (k.modPow(mN, mod).isOne()) {
        return k.pow(mN);
      }
    }
  }
}
