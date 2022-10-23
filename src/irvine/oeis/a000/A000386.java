package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a058.A058057;

/**
 * A000386 Coefficients of m\u00e9nage hit polynomials.
 * @author Sean A. Irvine
 */
public class A000386 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return A058057.t(mN, mN - 3);
  }
}
