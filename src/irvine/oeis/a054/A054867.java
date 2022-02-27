package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a331.A331406;

/**
 * A054867 Number of non-attacking configurations on a diamond of size n, where a prince attacks the four adjacent non-diagonal squares.
 * @author Sean A. Irvine
 */
public class A054867 extends A331406 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
