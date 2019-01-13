package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000344.
 * @author Sean A. Irvine
 */
public class A000344 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(2 * mN, mN - 2).multiply(5).divide(mN + 3);
  }
}
