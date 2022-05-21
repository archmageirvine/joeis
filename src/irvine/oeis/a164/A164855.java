package irvine.oeis.a164;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A164855 Generalized Lucas-Pascal triangle: (101*100^n,1).
 * @author Georg Fischer
 */
public class A164855 extends Triangle {

  /** Construct the sequence. */
  public A164855() {
    hasRAM(false);
  }

  /* T(0, 0)=1, T(n+1, 0)=101*100^n, T(n,n)=1, T(n,k)=T(n-1,k-1)+T(n-1,k) for 0<k<n. */
  @Override
  public Z compute(final int n, final int k) {
    return n == 0 || k == n ? Z.ONE : (k == 0 ? Z.valueOf(100).pow(n - 1).multiply(101) : get(n - 1, k - 1).add(get(n - 1, k)));
  }
}
