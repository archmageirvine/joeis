package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007925 a(n) = n^(n+1) - (n+1)^n.
 * @author Sean A. Irvine
 */
public class A007925 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).pow(mN + 1).subtract(Z.valueOf(mN + 1).pow(mN));
  }
}
