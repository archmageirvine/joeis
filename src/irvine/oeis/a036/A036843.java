package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A036843 Floor(X/Y), where X = concatenation of the triangular numbers and Y = concatenation of natural numbers.
 * @author Sean A. Irvine
 */
public class A036843 extends A000217 {

  private final StringBuilder mT = new StringBuilder();
  private final StringBuilder mA = new StringBuilder();
  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    mA.append(++mN);
    mT.append(super.next());
    return new Z(mT).divide(new Z(mA));
  }
}
