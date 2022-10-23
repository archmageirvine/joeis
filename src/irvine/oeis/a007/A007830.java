package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007830 a(n) = (n+3)^n.
 * @author Sean A. Irvine
 */
public class A007830 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 3).pow(mN);
  }
}
