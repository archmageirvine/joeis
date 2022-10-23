package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004429 Geometric mean of digits of n (rounded to nearest integer).
 * @author Sean A. Irvine
 */
public class A004429 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String n = String.valueOf(++mN);
    Z m = Z.ONE;
    for (int k = 0; k < n.length(); ++k) {
      m = m.multiply(n.charAt(k) - '0');
    }
    final Z r0 = m.root(n.length());
    final Z r1 = r0.add(1);
    final Z a = r0.pow(n.length());
    final Z b = r1.pow(n.length());
    return m.subtract(a).compareTo(b.subtract(m)) < 0 ? r0 : r1;
  }
}

