package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067095 a(n) = floor(X/Y) where X is the concatenation in increasing order of the first n even numbers and Y is that of the first n odd numbers.
 * @author Sean A. Irvine
 */
public class A067095 extends Sequence1 {

  private long mN = -1;
  private final StringBuilder mX = new StringBuilder();
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mX.append(mN + 1);
    mY.append(mN);
    return new Z(mX).divide(new Z(mY));
  }
}
