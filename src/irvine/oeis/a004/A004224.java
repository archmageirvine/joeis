package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004224 a(n) = 100*log_10(n) rounded up.
 * @author Sean A. Irvine
 */
public class A004224 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(100.0 * Math.log10(++mN)));
  }
}
