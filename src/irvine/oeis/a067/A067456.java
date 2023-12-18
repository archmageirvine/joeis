package irvine.oeis.a067;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067456 Floor( sqrt( sum of the decimal digits of n squared)).
 * @author Sean A. Irvine
 */
public class A067456 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.sqrt(LongUtils.digitSumSquares(++mN)));
  }
}
