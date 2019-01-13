package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a259.A259985;

/**
 * A005777.
 * @author Sean A. Irvine
 */
public class A005777 extends A259985 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return get(mN, mN - 1);
  }
}
