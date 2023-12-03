package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067090 Floor(X/Y) where X = concatenation of (2n), (2n-1), ... down to n+1 and Y = concatenation of 1,2,3,... up to n.
 * @author Sean A. Irvine
 */
public class A067090 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();

  @Override
  public Z next() {
    mX.append(++mN);
    final StringBuilder y = new StringBuilder();
    for (long k = 0; k < mN; ++k) {
      y.append(2 * mN - k);
    }
    return new Z(y).divide(new Z(mX));
  }
}
