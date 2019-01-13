package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;

/**
 * A002419.
 * @author Sean A. Irvine
 */
public class A002419 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 2, 3).multiply(6 * mN - 2).divide(4);
  }
}
