package irvine.oeis.a004;

import irvine.math.r.Constants;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004257 a(n) = round(log_2(n)).
 * @author Sean A. Irvine
 */
public class A004257 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(Constants.INV_LN2 * Math.log(++mN)));
  }
}
