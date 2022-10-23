package irvine.oeis.a028;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028322 Central elements in the 5-Pascal triangle A028313.
 * @author Sean A. Irvine
 */
public class A028322 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 1 ? Z.ONE : Binomial.binomial(2 * mN, mN).add(Binomial.binomial(2 * mN - 2, mN - 1).multiply(3));
  }
}
