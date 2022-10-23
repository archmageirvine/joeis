package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050548 Iterated triangular numbers.
 * @author Sean A. Irvine
 */
public class A050548 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : Binomial.binomial(mA.add(1), Z.TWO);
    return mA;
  }
}
