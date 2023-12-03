package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067092 a(n) = floor(X/Y) where X = concatenation in decreasing order of (2n)-th even number to (n+1)-th even number and Y = that of first n even numbers in increasing order.
 * @author Sean A. Irvine
 */
public class A067092 extends Sequence0 {

  private long mN = 0;
  private final StringBuilder mX = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mX.append(mN);
    final StringBuilder y = new StringBuilder();
    for (long k = 0; k < mN; k += 2) {
      y.append(2 * mN - k);
    }
    return new Z(y).divide(new Z(mX));
  }
}
