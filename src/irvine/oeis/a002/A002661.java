package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002661 Least integer having Radon random number <code>n</code>.
 * @author Sean A. Irvine
 */
public class A002661 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN, mN / 2).add(1).divide2();
  }
}
