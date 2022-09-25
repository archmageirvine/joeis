package irvine.oeis.a059;

import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.a060.A060052;

/**
 * A059443 Triangle T(n,k) (n &gt;= 2, k = 3..n+floor(n/2)) giving number of bicoverings of an n-set with k blocks.
 * @author Sean A. Irvine
 */
public class A059443 extends A060052 {

  @Override
  protected Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, n, k -> Stirling.secondKind(n, k).multiply(super.t(k, m)));
  }
}
