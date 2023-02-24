package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061302 a(n) = n! * [x^n] W(-x)*(W(-x) + 2)/(W(-x) + 1), where W denotes Lambert's W function.
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
