package irvine.oeis.a002;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002420 Expansion of <code>sqrt(1 - 4*x)</code> in powers of x.
 * @author Sean A. Irvine
 */
public class A002420 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN).divide(1 - 2 * mN);
  }
}

