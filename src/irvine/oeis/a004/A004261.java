package irvine.oeis.a004;

import irvine.math.r.Constants;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004261 a(n) = ceiling(10*log_2(n)).
 * @author Sean A. Irvine
 */
public class A004261 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(10.0 * Constants.INV_LN2 * Math.log(++mN)));
  }
}
