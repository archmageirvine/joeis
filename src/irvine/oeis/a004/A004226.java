package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004226 1000*log_10 (n) rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A004226 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(1000.0 * Math.log10(++mN)));
  }
}
