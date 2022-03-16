package irvine.oeis.a173;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.triangle.RationalTriangle;

/**
 * A173651 Triangle T(n,m) read by rows: numerator of 1/(n-m)^2-1/m^2, or -1 if m=0.
 * @author Georg Fischer
 */
public class A173651 extends RationalTriangle {

  /** Construct the sequence. */
  public A173651() {
    hasRAM(true);
  }

  @Override
  public Q compute(int n, final int m) {
    ++n;
    return m == 0 ? Q.NEG_ONE : new Q(Z.ONE, Z.valueOf(n - m).square()).subtract(new Q(1, m * m));
  }
}
