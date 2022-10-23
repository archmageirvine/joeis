package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004428 Geometric mean of digits of n (rounded down).
 * @author Sean A. Irvine
 */
public class A004428 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String n = String.valueOf(++mN);
    Z m = Z.ONE;
    for (int k = 0; k < n.length(); ++k) {
      m = m.multiply(n.charAt(k) - '0');
    }
    return m.root(n.length());
  }
}

