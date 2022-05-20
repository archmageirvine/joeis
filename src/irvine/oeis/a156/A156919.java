package irvine.oeis.a156;
// manually trecpas

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A156919 Table of coefficients of polynomials related to the Dirichlet eta function.
 * @author Georg Fischer
 */
public class A156919 extends Triangle {

  /** Construct the sequence. */
  public A156919() {
    hasRAM(false);
  }

  /* Maple:
  A156919 := proc(n, m) 
    if n=m then 1; 
    elif m=0 then 2^n ; 
    elif m<0 or m>n then 0; 
    else 2*(m+1)*procname(n-1, m)+(2*n-2*m+1)*procname(n-1, m-1) ; 
    end if; end proc: 
    seq(seq(A156919(n, m), m=0..n), n=0..7);
  */
  @Override
  protected Z compute(final int n, final int k) {
    if (k == n) {
      return Z.ONE;
    }
    if (k == 0) {
      return Z.ONE.shiftLeft(n);
    }
    return get(n - 1, k - 1).multiply(2 * (n - k) + 1).add(get(n - 1, k).multiply(2 * (k + 1)));
  }
}
