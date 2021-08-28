package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051179 a(n) = 2^(2^n) - 1.
 * @author Sean A. Irvine
 */
public class A051179 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(1 << ++mN).subtract(1);
  }
}
