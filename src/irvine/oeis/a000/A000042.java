package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000042 Unary representation of natural numbers.
 * @author Sean A. Irvine
 */
public class A000042 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.multiply(10).add(1);
    return mN;
  }
}

