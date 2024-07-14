package irvine.oeis.a127;
// manually 2024-07-13

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.Triangle;

/**
 * A127672 Monic integer version of Chebyshev T-polynomials (increasing powers).
 * @author Georg Fischer
 */
public class A127672 extends Triangle implements DirectArray {

  @Override
  public Z compute(final int n, final int k) {
    // System.out.print("(" + n + ", " + k + ") -> " + a(n,k) + "\t");
    if (k == 0) {
      return ((n & 1) == 1) ? Z.ZERO : Z.valueOf(((n & 2) == 0) ? 2 : -2);
    } else if (k == 1) {
      return ((n & 1) == 0) ? Z.ZERO : Z.valueOf(((n & 2) == 0) ? n : -n);
    } else {
      return get(n - 1, k - 1).subtract(get(n - 2, k));
    }
  }

  @Override
  public Z a(final int n, final int k) {
    if (n < k || ((n + k) & 1) == 1) {
      return Z.ZERO;
    } else if (k == 0) {
      return Z.NEG_ONE.pow(n / 2).multiply2();
    } else {
      // a(n,m) := 0 if n < m or n+m odd; a(n,0) = 2*(-1)^(n/2) (n even); 
      // else a(n,m) = ((-1)^((n+m)/2 + m))*n*binomial((n+m)/2-1,m-1)/m.
      return Z.NEG_ONE.pow((n + k) / 2 + k).multiply(n).multiply(Binomial.binomial((n + k) / 2 - 1, k - 1)).divide(k);
    }
  }

}
