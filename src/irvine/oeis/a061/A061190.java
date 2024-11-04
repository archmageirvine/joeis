package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061190 a(n) = n^n - n.
 * @author Sean A. Irvine
 */
public class A061190 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).subtract(mN);
  }
}
