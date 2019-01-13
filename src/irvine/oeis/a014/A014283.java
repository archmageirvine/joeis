package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A014283.
 * @author Sean A. Irvine
 */
public class A014283 extends A000045 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().subtract(Z.valueOf(++mN).square());
  }
}

