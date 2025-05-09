package irvine.oeis.a077;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A077175 Product of terms in n-th row of triangle in A077172.
 * @author Sean A. Irvine
 */
public class A077175 extends A077172 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(0, ++mN, k -> super.next());
  }
}

