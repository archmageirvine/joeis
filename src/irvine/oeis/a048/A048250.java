package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048250 Sum of the squarefree divisors of n.
 * @author Sean A. Irvine
 */
public class A048250 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    for (final Z p : Jaguar.factor(++mN).toZArray()) {
      prod = prod.multiply(p.add(1));
    }
    return prod;
  }
}
