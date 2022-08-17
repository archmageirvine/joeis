package irvine.oeis.a341;

import irvine.math.z.Z;
import irvine.oeis.a342.A342053;

/**
 * A342053.
 * @author Sean A. Irvine
 */
public class A341924 extends A342053 {

  private int mN = 0;

  @Override
  public Z next() {
    return a341923ColSeq(++mN, 4).coeff(mN);
  }
}
