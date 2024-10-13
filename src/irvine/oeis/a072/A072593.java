package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072593 In prime factorization of n replace multiplication with bitwise logical 'or'.
 * @author Sean A. Irvine
 */
public class A072593 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z or = Z.ZERO;
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      or = or.or(p);
    }
    return or;
  }
}
