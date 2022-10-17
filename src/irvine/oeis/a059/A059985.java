package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059985 \u0141ukasiewicz words as integers written in factorial base.
 * @author Sean A. Irvine
 */
public class A059985 extends A059984 {

  @Override
  public Z next() {
    Z f = Z.ONE;
    Z sum = Z.ZERO;
    long k = -1;
    for (final int v : step()) {
      if (++k > 1) {
        f = f.multiply(k);
      }
      sum = sum.add(f.multiply(v));
    }
    return sum;
  }
}
