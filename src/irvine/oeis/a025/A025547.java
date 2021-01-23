package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a005.A005408;

/**
 * A025547 Least common multiple of {1,3,5,...,2n-1}.
 * @author Sean A. Irvine
 */
public class A025547 extends A005408 {

  private Z mL = Z.ONE;

  @Override
  public Z next() {
    mL = mL.lcm(super.next());
    return mL;
  }
}
