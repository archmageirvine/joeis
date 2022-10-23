package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014105 Second hexagonal numbers: a(n) = n*(2*n + 1).
 * @author Sean A. Irvine
 */
public class A014105 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(2 * mN + 1);
  }
}
