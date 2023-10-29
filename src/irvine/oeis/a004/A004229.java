package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004229 a(n) = 10000*log_10(n) rounded to the nearest integer.
 * @author Sean A. Irvine
 */
public class A004229 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(Math.round(10000.0 * Math.log10(++mN)));
  }
}
