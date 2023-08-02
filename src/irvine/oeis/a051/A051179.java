package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051179 a(n) = 2^(2^n) - 1.
 * @author Sean A. Irvine
 */
public class A051179 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(1L << ++mN).subtract(1);
  }
}
