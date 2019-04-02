package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a259.A259095;

/**
 * A005575 a(n) = A259095(2n,n).
 * @author Sean A. Irvine
 */
public class A005575 extends A259095 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return a259095(2 * mN, mN);
  }
}

