package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a259.A259985;

/**
 * A005778.
 * @author Sean A. Irvine
 */
public class A005778 extends A259985 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    return get(mN, mN - 2);
  }
}
