package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.a000.A000607;

/**
 * A394668 Number of partitions of n^2 into prime parts.
 * @author Sean A. Irvine
 */
public class A394668 extends A000607 {

  private long mN = -1;

  @Override
  public Z next() {
    return mS.coeff(++mN * mN);
  }
}

