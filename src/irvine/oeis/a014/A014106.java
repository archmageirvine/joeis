package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014106 a(n) = n*(2*n + 3).
 * @author Sean A. Irvine
 */
public class A014106 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(2 * mN + 3);
  }
}
