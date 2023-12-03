package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067088 Floor(X/Y) where X = concatenation of (n+1), (n+2), ...up to 2n and Y = concatenation of 1,2,3,4,... up to n.
 * @author Sean A. Irvine
 */
public class A067088 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();

  @Override
  public Z next() {
    mX.append(++mN);
    final StringBuilder y = new StringBuilder();
    for (long k = 1; k <= mN; ++k) {
      y.append(k + mN);
    }
    return new Z(y).divide(new Z(mX));
  }
}
