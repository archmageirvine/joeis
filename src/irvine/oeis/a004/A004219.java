package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004219 a(n) = floor(10*log_10(n)).
 * @author Sean A. Irvine
 */
public class A004219 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.floor(10.0 * Math.log10(++mN)));
  }
}
