package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051669 11*2^n - 4*n - 10.
 * @author Sean A. Irvine
 */
public class A051669 extends Sequence0 {

  private static final Z ELEVEN = Z.valueOf(11);
  private int mN = -1;

  @Override
  public Z next() {
    return ELEVEN.shiftLeft(++mN).subtract(4L * mN + 10);
  }
}

