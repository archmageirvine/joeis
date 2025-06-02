package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a074.A074586;

/**
 * A077584.
 * @author Sean A. Irvine
 */
public class A077596 extends A074586 {

  private int mN = 0;

  @Override
  public Z next() {
    return ++mN <= 4 ? Z.TWO.pow(mN - 1) : mB.get(mN, (mN + 1) / 2);
  }
}
