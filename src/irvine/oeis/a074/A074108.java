package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074108 Smallest number such that the concatenation of first n terms is a proper multiple of the concatenation of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A074108 extends Sequence0 {

  private final StringBuilder mA = new StringBuilder();
  private final StringBuilder mB = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mA.append(mN);
    if (mN == 1) {
      mB.append('2');
      return Z.TWO;
    }
    final Z mod = new Z(mA);
    Z b = new Z(mB);
    Z t = Z.ONE;
    while (true) {
      final Z u = t;
      b = b.multiply(10);
      t = t.multiply(10);
      Z c = b.negate().mod(mod);
      while (c.compareTo(u) < 0) {
        c = c.add(mod);
      }
      if (c.compareTo(t) < 0) {
        mB.append(c);
        return c;
      }
    }
  }
}
