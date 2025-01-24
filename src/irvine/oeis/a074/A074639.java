package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A074639 a(n)=Sum_h (hh'-1)/n with h and h' in [1,n], (h,n)=1, hh'=1 (mod n).
 * @author Sean A. Irvine
 */
public class A074639 extends Sequence0 implements DirectSequence {

  private long mN = -1;

  @Override
  public Z a(final Z n) {
    if (n.compareTo(Z.TWO) <= 0) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (Z h = Z.ONE; h.compareTo(n) < 0; h = h.add(1)) {
      if (Functions.GCD.z(h, n).equals(Z.ONE)) {
        sum = sum.add(h.multiply(h.modInverse(n)));
      }
    }
    return sum.divide(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
