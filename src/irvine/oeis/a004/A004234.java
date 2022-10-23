package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004234 a(n) = floor(10*log(n)).
 * @author Sean A. Irvine
 */
public class A004234 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(10.0 * Math.log(++mN)));
  }
}
