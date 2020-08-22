package irvine.oeis.a004;

import irvine.math.r.Constants;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004259 a(n) = floor(10*log_2(n)).
 * @author Sean A. Irvine
 */
public class A004259 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(10.0 * Constants.INV_LN2 * Math.log(++mN)));
  }
}
