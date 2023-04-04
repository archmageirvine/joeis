package irvine.oeis.a062;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062570 a(n) = phi(2*n).
 * @author Sean A. Irvine
 */
public class A062570 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return Euler.phi(mN);
  }
}
