package irvine.oeis.a028;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028322 Central elements in the 5-Pascal triangle <code>A028313</code>.
 * @author Sean A. Irvine
 */
public class A028322 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 1 ? Z.ONE : Binomial.binomial(2 * mN, mN).add(Binomial.binomial(2 * mN - 2, mN - 1).multiply(3));
  }
}
