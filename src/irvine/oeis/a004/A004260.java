package irvine.oeis.a004;

import irvine.math.r.Constants;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004260.
 * @author Sean A. Irvine
 */
public class A004260 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(10.0 * Constants.INV_LN2 * Math.log(++mN)));
  }
}
