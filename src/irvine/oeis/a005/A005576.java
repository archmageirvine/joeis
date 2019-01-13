package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a259.A259095;

/**
 * A005576.
 * @author Sean A. Irvine
 */
public class A005576 extends A259095 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int r = mN + 1;
    return a259095(r * (r + 1) / 2 - mN, r);
  }
}

