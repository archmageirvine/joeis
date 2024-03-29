package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004243 a(n) = floor(10000*log(n)).
 * @author Sean A. Irvine
 */
public class A004243 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(10000.0 * Math.log(++mN)));
  }
}
