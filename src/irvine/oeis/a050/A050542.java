package irvine.oeis.a050;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A050542 Iterated triangular numbers with seed 5.
 * @author Sean A. Irvine
 */
public class A050542 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : Binomial.binomial(mA.add(1), Z.TWO);
    return mA;
  }
}
