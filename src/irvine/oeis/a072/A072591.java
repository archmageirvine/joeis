package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072591 In prime factorization of n replace multiplication with bitwise logical 'and'.
 * @author Sean A. Irvine
 */
public class A072591 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z and = null;
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      and = and == null ? p : and.and(p);
    }
    return and;
  }
}
