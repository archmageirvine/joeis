package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060375 a(n) = (n+2)^(n+3) - n^(n+1).
 * @author Sean A. Irvine
 */
public class A060375 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 2).pow(mN + 3).subtract(Z.valueOf(mN).pow(mN + 1));
  }
}
