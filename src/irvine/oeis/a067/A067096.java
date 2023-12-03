package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067096 Floor[X/Y] where X = concatenation in increasing order of first n even numbers and Y = that of first n natural numbers.
 * @author Sean A. Irvine
 */
public class A067096 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mX.append(2 * ++mN);
    mY.append(mN);
    return new Z(mX).divide(new Z(mY));
  }
}
