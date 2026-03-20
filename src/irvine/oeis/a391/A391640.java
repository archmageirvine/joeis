package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.matrix.Hafnian;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391640 a(n) is the hafnian of the 2n X 2n Hankel matrix whose generic element is given by A000045(i+j-1) with i,j = 1, ..., n.
 * @author Sean A. Irvine
 */
public class A391640 extends Sequence0 {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    final long[][] m = new long[mN][mN];
    for (int k = 0; k < mN; ++k) {
      for (int j = 0; j < mN; ++j) {
        m[k][j] = Functions.FIBONACCI.z(k + j + 1).longValueExact(); // Done like this to detect long overflow
      }
    }
    return Hafnian.hafnian(m);
  }
}
