package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014206 a(n) = n^2 + n + 2.
 * @author Sean A. Irvine
 */
public class A014206 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).square().add(mN + 2);
  }
}
