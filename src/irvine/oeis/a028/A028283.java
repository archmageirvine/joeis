package irvine.oeis.a028;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028283 Central elements in 4-Pascal triangle A028275 (by row).
 * @author Sean A. Irvine
 */
public class A028283 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 1 ? Z.ONE : Binomial.binomial(2 * mN, mN).add(Binomial.binomial(2 * mN - 2, mN - 1).multiply2());
  }
}
