package irvine.oeis.a057;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057741 Table T(n,k) giving number of elements of order k in dihedral group D_{2n} of order 2n, n &gt;= 1, 1&lt;=k&lt;=g(n), where g(n) = 2 if n=1 else g(n) = n.
 * @author Sean A. Irvine
 */
public class A057741 implements Sequence {

  private int mN = 1;
  private int mM = 0;

  private Z t(final int n, final int k) {
    if (k == 2) {
      return Z.valueOf(n | 1);
    }
    if (n % k != 0) {
      return Z.ZERO;
    }
    return Euler.phi(Z.valueOf(k));
  }

  @Override
  public Z next() {
    if (++mM > Math.max(2, mN)) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
