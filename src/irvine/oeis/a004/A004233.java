package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A004233 a(n) = ceiling(log(n)).
 * @author Sean A. Irvine
 */
public class A004233 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf((long) Math.ceil(Math.log(++mN)));
  }
}
