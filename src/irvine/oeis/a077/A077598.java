package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.a074.A074586;

/**
 * A077584.
 * @author Sean A. Irvine
 */
public class A077598 extends A074586 {

  private int mN = 0;

  @Override
  public Z next() {
    return mB.get(++mN, 3);
  }
}
