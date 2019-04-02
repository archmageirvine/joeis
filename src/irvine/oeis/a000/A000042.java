package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000042 Unary representation of natural numbers.
 * @author Sean A. Irvine
 */
public class A000042 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.multiply(10).add(1);
    return mN;
  }
}

