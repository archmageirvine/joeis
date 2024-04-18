package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057764 Triangle T(n,k) = number of nonzero elements of multiplicative order k in Galois field GF(2^n) (n &gt;= 1, 1 &lt;= k &lt;= 2^n-1).
 * @author Sean A. Irvine
 */
public class A057764 extends Sequence1 {

  private int mN = 0;
  private long mM = 0;

  private Z t(final int n, final long m) {
    return ((1L << n) - 1) % m == 0 ? Functions.PHI.z(Z.valueOf(m)) : Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mM >= 1L << mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

