package irvine.oeis.a174;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A174587 Triangle read by rows: T(n,k) = S(n,k) - S(n,0) + 1 where S(n,k) = Sum_{j=0..n} (-1)^j * (k-j)^n * Eulerian1(n+1, j) with S(0,k)=1.
 * @author Sean A. Irvine
 */
public class A174587 extends Sequence0 {

  private int mN = -1;
  private int mM = -1;

  private Z s(final int n, final int k) {
    if (n == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, n, j -> Z.NEG_ONE.pow(j).multiply(Z.valueOf(k - j).pow(n)).multiply(Functions.EULERIAN1.z(n + 1, j)));
  }

  private Z t(final int n, final int m) {
    return s(n, m).subtract(s(n, 0)).add(1);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

