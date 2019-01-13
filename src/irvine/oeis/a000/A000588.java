package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000588.
 * @author Sean A. Irvine
 */
public class A000588 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 3).multiply(7).divide(mN + 4);
  }
}

