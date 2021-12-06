package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053087 Lowest j for which 2^j kara n is defined.
 * @author Sean A. Irvine
 */
public class A053087 implements Sequence {

  private Z mN = Z.ZERO;

  static Z kara(final Z a, final Z b) {
    final Z c = a.divide(b);
    if (c.isZero()) {
      return null;
    }
    if (c.multiply(b).equals(a)) {
      return c;
    }
    final Z c1 = c.add(1);
    if (c1.multiply(b.subtract(1)).compareTo(a) < 0 && c1.multiply(b).compareTo(a) >= 0) {
      return c1;
    }
    return null;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    int j = 0;
    Z t = Z.ONE;
    while (kara(t, mN) == null) {
      t = t.multiply2();
      ++j;
    }
    return Z.valueOf(j);
  }
}
