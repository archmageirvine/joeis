package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064434 a(n) = (2*a(n-1) + 1) mod n.
 * @author Sean A. Irvine
 */
public class A064434 extends Sequence1 {

  private long mA = 0;
  private long mN = 0;

  @Override
  public Z next() {
    mA = (2 * mA + 1) % ++mN;
    return Z.valueOf(mA);
  }
}
