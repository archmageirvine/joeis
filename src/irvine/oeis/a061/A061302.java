package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061302 n*(n-1)^(n-2).
 * @author Sean A. Irvine
 */
public class A061302 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN - 1).pow(mN - 2).multiply(mN);
  }
}
