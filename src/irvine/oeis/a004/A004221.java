package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004221 a(n) = ceiling(10*log_10(n)).
 * @author Sean A. Irvine
 */
public class A004221 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(10.0 * Math.log10(++mN)));
  }
}
