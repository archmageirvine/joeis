package irvine.oeis.a077;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A077162 Sum of terms in n-th rows of triangle in A077159.
 * @author Sean A. Irvine
 */
public class A077162 extends A077159 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}

