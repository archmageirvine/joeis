package irvine.oeis.a239;
// manually 2025-06-12/coden

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A239225 Denominator of 2n/v(n)^2, where v(1) = 0, v(2) = 1, and v(n) = v(n-1)/(n-2) + v(n-2) for n &gt;= 3. (Limit of 2n/v(n)^2 is Pi.).
 * @author Georg Fischer
 */
public class A239225 extends A239224 {

  @Override
  public Z next() {
    ++mN;
    final Z result = Q.valueOf(mN * 2L).divide(super.nextQ().square()).den();
    return mN == 1 ? Z.ONE : result;
  }
}
