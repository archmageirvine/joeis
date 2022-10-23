package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004240 a(n) = floor(1000*log(n)).
 * @author Sean A. Irvine
 */
public class A004240 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(1000.0 * Math.log(++mN)));
  }
}
