package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a342.A342053;

/**
 * A058786.
 * @author Sean A. Irvine
 */
public class A058786 extends A342053 {

  private int mN = 0;

  @Override
  public Z next() {
    return a342053ColSeq(++mN, 4).coeff(mN);
  }
}
