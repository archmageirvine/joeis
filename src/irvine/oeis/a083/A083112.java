package irvine.oeis.a083;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A083112 Product of terms in row n of A083110.
 * @author Sean A. Irvine
 */
public class A083112 extends A083110 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(0, ++mN, k -> super.next());
  }
}

