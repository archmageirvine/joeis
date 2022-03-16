package irvine.oeis.a165;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A165507 Triangle T(n,m) read by rows: numerator of 1/(1+n-m)^2 - 1/m^2.
 * @author Georg Fischer
 */
public class A165507 extends RationalTriangle {

  /** Construct the sequence. */
  public A165507() {
    hasRAM(true);
  }

  @Override
  public Q compute(int n, int m) {
    ++n;
    ++m;
    return n == 1 ? Q.ZERO : new Q(Z.ONE, Z.valueOf(1 + n - m).square()).subtract(new Q(1, m * m));
  }
}
