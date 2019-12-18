package irvine.oeis.a028;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028270 Central elements in 3-Pascal triangle <code>A028262</code> (by row).
 * @author Sean A. Irvine
 */
public class A028270 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 1 ? Z.ONE : Binomial.binomial(2 * mN, mN).add(Binomial.binomial(2 * mN - 2, mN - 1));
  }
}
