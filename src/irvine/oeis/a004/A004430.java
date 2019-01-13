package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004430.
 * @author Sean A. Irvine
 */
public class A004430 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String n = String.valueOf(++mN);
    Z m = Z.ONE;
    for (int k = 0; k < n.length(); ++k) {
      m = m.multiply(n.charAt(k) - '0');
    }
    final Z r0 = m.root(n.length());
    return m.auxiliary() != 0 ? r0 : r0.add(1);
  }
}

