package irvine.oeis.a083;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A083171 a(n) = the arithmetic mean of the n-th row of triangle A083167.
 * @author Sean A. Irvine
 */
public class A083171 extends A083167 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, j -> super.next()).divide(mN + 1);
  }
}

