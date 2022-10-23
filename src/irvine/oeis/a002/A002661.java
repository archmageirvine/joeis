package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002661 Least integer having Radon random number n.
 * @author Sean A. Irvine
 */
public class A002661 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, mN / 2).add(1).divide2();
  }
}
