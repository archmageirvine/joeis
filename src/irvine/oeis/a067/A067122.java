package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067122 Floor[X/Y] where X = concatenation of first n odd numbers in increasing order (A019519) and Y = their sum (A000290 = n^2).
 * @author Sean A. Irvine
 */
public class A067122 extends Sequence1 {

  private long mN = -1;
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
