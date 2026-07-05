package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395532 Square array read by antidiagonals downward: convolved numbers of order n of k-sections of the Fibonacci sequence at the third element position T(n, k) for n &gt;= 0 and k &gt;= 1.
 * @author Sean A. Irvine
 */
public class A395532 extends Sequence0 {

  private long mN = 0;
  private long mM = -1;

  private Z t(final long n, final long m) {
    return Functions.TRIANGULAR.z(n + 1).multiply(Functions.LUCAS.z(m).square()).signedAdd((m & 1) == 1, Z.valueOf(n + 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM + 1);
  }
}
