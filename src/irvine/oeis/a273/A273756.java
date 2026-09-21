package irvine.oeis.a273;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A273756 Least p for which min { x &gt;= 0 | p + (2n+1)*x + x^2 is composite } reaches the (local) maximum given in A273770.
 * @author Sean A. Irvine
 */
public class A273756 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long p = 2 * mN + 1;
    long m = 0;
    long best = 0;
    final long l = CR.TEN.pow(new Q(50 + mN, 10)).floor().longValueExact();
    for (long q = 2; q <= l; q = Functions.NEXT_PRIME.l(q)) {
      long x = 0;
      while (Z.valueOf(++x).multiply(x + p).add(q).isProbablePrime()) {
        // do nothing
      }
      if (x > m) {
        best = q;
        m = x;
      }
    }
    return Z.valueOf(best);
  }
}
