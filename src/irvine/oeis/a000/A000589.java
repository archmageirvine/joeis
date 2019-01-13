package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000589.
 * @author Sean A. Irvine
 */
public class A000589 implements Sequence {

  private long mN = 4;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 5).multiply(11).divide(mN + 6);
  }
}

