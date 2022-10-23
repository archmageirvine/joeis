package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014050 a(n) = (n^2+1)^n.
 * @author Sean A. Irvine
 */
public class A014050 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN * (long) mN + 1).pow(mN);
  }
}
