package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067091 Floor(X/Y) where X = concatenation of the (n+1)-st even number through the (2n)-th even number and Y = concatenation of first n even numbers.
 * @author Sean A. Irvine
 */
public class A067091 extends Sequence1 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mX.append(mN);
    final StringBuilder y = new StringBuilder();
    for (long k = 2; k <= mN; k += 2) {
      y.append(k + mN);
    }
    return new Z(y).divide(new Z(mX));
  }
}
