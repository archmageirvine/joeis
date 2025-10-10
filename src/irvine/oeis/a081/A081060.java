package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081060 Product of differences of distinct prime factors of n.
 * @author Sean A. Irvine
 */
public class A081060 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final Z[] f = Jaguar.factor(++mN).toZArray();
    for (final Z p : f) {
      for (final Z q : f) {
        if (q.equals(p)) {
          break;
        }
        prod = prod.multiply(p.subtract(q));
      }
    }
    return prod;
  }
}
