package irvine.oeis.a083;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A083108 Product of terms in row n of A083106.
 * @author Sean A. Irvine
 */
public class A083108 extends A083106 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(0, ++mN, k -> super.next());
  }
}

