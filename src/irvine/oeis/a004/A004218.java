package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004218 a(n) = log_10(n) rounded up.
 * @author Sean A. Irvine
 */
public class A004218 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(Math.log10(++mN)));
  }
}
