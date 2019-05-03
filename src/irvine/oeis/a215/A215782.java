package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A215782 Odd tribonacci <code>non-divisors</code>.
 * @author Sean A. Irvine
 */
public class A215782 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      Z a = Z.ONE;
      Z b = Z.ONE;
      Z c = Z.ONE;
      while (true) {
        final Z s = a.add(b).add(c);
        a = b;
        b = c;
        c = s.mod(mN);
        if (c.equals(Z.ZERO)) {
          break;
        }
        if (c.equals(Z.ONE) && a.equals(Z.ONE) && b.equals(Z.ONE)) {
          return mN;
        }
      }
    }
  }
}
