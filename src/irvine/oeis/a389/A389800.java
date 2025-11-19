package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389800 Array read by ascending antidiagonals: A(n, k) = A000045(n)^2 + A000045(n+k)^2.
 * @author Sean A. Irvine
 */
public class A389800 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Functions.FIBONACCI.z(n).square().add(Functions.FIBONACCI.z(n + m).square());
  }

  @Override
  public Z next() {
    if (++mM > mN) {
       ++mN;
       mM = 0;
    }
    return t(mN - mM, mM);
  }
}
