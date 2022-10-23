package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004236 a(n) = ceiling(10*log(n)).
 * @author Sean A. Irvine
 */
public class A004236 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(10.0 * Math.log(++mN)));
  }
}
