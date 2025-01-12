package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074105 Smallest multiple of the n-th prime such that the n-th partial sum is divisible by n.
 * @author Sean A. Irvine
 */
public class A074105 extends A000040 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z p = super.next();
    Z k = Z.ZERO;
    while (true) {
      k = k.add(p);
      final Z t = mSum.add(k);
      if (t.mod(mN) == 0) {
        mSum = t;
        return k;
      }
    }
  }
}
