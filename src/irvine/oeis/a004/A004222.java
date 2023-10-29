package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004222 a(n) = 100*log_10(n) rounded down.
 * @author Sean A. Irvine
 */
public class A004222 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(100.0 * Math.log10(++mN)));
  }
}
