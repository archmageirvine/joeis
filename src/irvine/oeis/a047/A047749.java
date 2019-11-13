package irvine.oeis.a047;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a001.A001764;

/**
 * A047749.
 * @author Sean A. Irvine
 */
public class A047749 extends A001764 {

  private long mN = -1;

  protected Z a47749(final long n) {
    if ((n & 1) == 1) {
      final long x = (n - 1) / 2;
      return Binomial.binomial(3 * x + 1, 2 * x + 1).divide(x + 1);
    }
    return a1764(n / 2);
  }

  @Override
  public Z next() {
    return a47749(++mN);
  }
}
