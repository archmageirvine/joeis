package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a004.A004111;

/**
 * A000220 Number of asymmetric trees with n nodes (also called identity <code>trees)</code>.
 * @author Sean A. Irvine
 */
public class A000220 extends A004111 {

  /** Construct the sequence. */
  public A000220() {
    super.next();
  }

  @Override
  public Z next() {
    Z a = super.next().multiply2();
    if ((mN & 1) == 0) {
      a = a.subtract(get(mN / 2));
    }
    for (int k = 0; k <= mN; ++k) {
      a = a.subtract(get(k).multiply(get(mN - k)));
    }
    return a.divide2();
  }
}

