package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067105 a(n) = floor[ X/Y], where X = concatenation of k^k from 1 up to n^n and Y = concatenation of 1, ..., n.
 * @author Sean A. Irvine
 */
public class A067105 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();
  private final StringBuilder mY = new StringBuilder();

  @Override
  public Z next() {
    mX.append(Z.valueOf(++mN).pow(mN));
    mY.append(mN);
    return new Z(mX).divide(new Z(mY));
  }
}
