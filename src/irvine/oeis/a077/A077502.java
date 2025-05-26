package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A077502 Smallest square greater than the previous term and beginning with n.
 * @author Sean A. Irvine
 */
public class A077502 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    final String target = String.valueOf(++mN);
    Z b = mA.sqrt();
    while (true) {
      final Z s = b.square();
      if (s.toString().startsWith(target)) {
        mA = s;
        return s;
      }
      b = b.add(1);
    }
  }
}
