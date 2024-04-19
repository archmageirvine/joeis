package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061301 a(n) = 2^(n*2^(n-1)).
 * @author Sean A. Irvine
 */
public class A061301 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft((1L << mN) * ++mN);
  }
}
