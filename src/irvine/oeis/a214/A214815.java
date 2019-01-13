package irvine.oeis.a214;

import irvine.math.z.Z;
import irvine.oeis.a006.A006387;

/**
 * A214815.
 * @author T. R. S. Walsh
 */
public class A214815 extends A006387 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(count(2, ++mN, 1, mN + 1, false)[3]);
  }
}
