package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053479 Circle numbers (version 6): a(n) = number of points (i+j/2,j*sqrt(3)/2), i,j integers (triangular grid) contained in a circle of diameter n, centered at (1/2, 1/(2*sqrt(3))).
 * @author Sean A. Irvine
 */
public class A053479 implements Sequence {

  // After R. J. Mathar

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    for (long a = -mN; a <= mN; ++a) {
      for (long b = -mN; b <= mN; ++b) {
        if (12 * (a * a + b * b + a * b - a - b) <= 3 * mN * mN - 4) {
          ++sum;
        }
      }
    }
    return Z.valueOf(sum);
  }
}
