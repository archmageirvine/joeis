package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000330;

/**
 * A051538 Least common multiple of {b(1),...,b(n)}, where b(k) = k(k+1)(2k+1)/6 = A000330(k).
 * @author Sean A. Irvine
 */
public class A051538 extends A000330 {

  {
    super.next();
  }
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mLcm = mLcm.lcm(super.next());
    return mLcm;
  }
}
