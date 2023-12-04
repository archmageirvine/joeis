package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067123 Floor[X/Y] where X = concatenation of first n cubes in increasing order and Y = concatenation of first n squares.
 * @author Sean A. Irvine
 */
public class A067123 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mX.append(Z.valueOf(++mN).pow(3));
    mY.append(mN * mN);
    return new Z(mX).divide(new Z(mY));
  }
}
