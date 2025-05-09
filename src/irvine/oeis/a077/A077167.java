package irvine.oeis.a077;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A077167 Sum of terms in n-th row of A077164.
 * @author Sean A. Irvine
 */
public class A077167 extends A077164 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}

