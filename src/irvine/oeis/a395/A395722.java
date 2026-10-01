package irvine.oeis.a395;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395722 allocated for Marco Rip\u00e0.
 * @author Sean A. Irvine
 */
public class A395722 extends Sequence1 {

  // Marco's formula is wrong

  private long mN = 0;

  @Override
  public Z next() {
    final Z c = Z.valueOf(2 * ++mN * mN + 2 * mN + 1);
    final Z c2 = c.square();
    final Z t = Z.valueOf(2 * mN + 1).square();
    return Integers.SINGLETON.product(1, mN, k -> c2.subtract(k * k).multiply(c2.subtract(t.multiply(k * k)))).multiply(c);
  }
}
// a(n) = c * Product_{k = 1..n} ((c^2 - k^2) * (c^2 - k^2 * (2*n + 1)^2)), where c = 2*n^2 + 2*n + 1.
