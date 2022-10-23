package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008130 a(n) = floor(n/3)*ceiling(n/3).
 * @author Sean A. Irvine
 */
public class A008130 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN / 3).multiply((mN + 2) / 3);
  }
}

