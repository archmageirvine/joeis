package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067101 Floor[ X/Y], where X = concatenation of the primes and Y = concatenation of natural numbers.
 * @author Sean A. Irvine
 */
public class A067101 extends A000040 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mX.append(super.next());
    mY.append(++mN);
    return new Z(mX).divide(new Z(mY));
  }
}
