package irvine.oeis.a395;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395722 Product of the distinct entries on the two main diagonals of the (2*n + 1) X (2*n + 1) square array formed by the integers 1, 2, ..., (2*n + 1)^2 in order.
 * @author Sean A. Irvine
 */
public class A395722 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z c = Z.valueOf(2 * ++mN * mN + 2 * mN + 1);
    final Z c2 = c.square();
    final Z t0 = Z.valueOf(mN).square().multiply(4);
    final Z t1 = Z.valueOf(mN + 1).square().multiply(4);
    return Integers.SINGLETON.product(1, mN, k -> c2.subtract(t0.multiply(k * k)).multiply(c2.subtract(t1.multiply(k * k)))).multiply(c);
  }
}
