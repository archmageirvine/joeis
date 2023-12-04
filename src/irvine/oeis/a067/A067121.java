package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067121 a(n) = floor[X/Y] where X = the concatenation of the first n even numbers in increasing order and Y = their sum.
 * @author Sean A. Irvine
 */
public class A067121 extends Sequence1 {

  private long mN = 0;
  private long mSum = 0;
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mSum += mN;
    mY.append(mN);
    return new Z(mY).divide(mSum);
  }
}
