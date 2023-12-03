package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067093 Floor[X/Y] where X = concatenation of (n+1)-st odd number through the 2n-th odd number and Y = concatenation of first n odd numbers.
 * @author Sean A. Irvine
 */
public class A067093 extends Sequence1 {

  private long mN = -1;
  private final StringBuilder mX = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mX.append(mN);
    final StringBuilder y = new StringBuilder();
    for (long k = 2; k <= mN + 1; k += 2) {
      y.append(k + mN);
    }
    return new Z(y).divide(new Z(mX));
  }
}
