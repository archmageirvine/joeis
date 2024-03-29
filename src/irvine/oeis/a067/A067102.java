package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067102 Floor[ X/Y] where X = concatenation of the squares and Y = concatenation of natural numbers.
 * @author Sean A. Irvine
 */
public class A067102 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mX.append(++mN * mN);
    mY.append(mN);
    return new Z(mX).divide(new Z(mY));
  }
}
