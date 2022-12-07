package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A006089.
 * @author Sean A. Irvine
 */
public class A006089 extends Sequence2 {

  // After https://loda-lang.org/edit/?oeis=6089

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z a = Z.ZERO;
    Z b = Z.ZERO;
    Z c = Z.ZERO;
    for (long k = mN; k >= 0; --k) {
      a = a.subtract(k);
      b = b.multiply(5).add(6);
      c = c.add(a);
      a = a.multiply(3).add(b).multiply(3);
      b = b.multiply(5);
    }
    return c.multiply2();
  }
}
