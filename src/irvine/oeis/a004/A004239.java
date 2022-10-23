package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004239 a(n) = ceiling(100*log(n)).
 * @author Sean A. Irvine
 */
public class A004239 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(100.0 * Math.log(++mN)));
  }
}
