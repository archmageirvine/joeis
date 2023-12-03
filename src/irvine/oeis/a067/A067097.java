package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067097 Floor[X/Y] where X = concatenation in increasing order of first n powers of 2 and Y = that of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A067097 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mX.append(Z.ONE.shiftLeft(++mN));
    mY.append(mN);
    return new Z(mX).divide(new Z(mY));
  }
}
