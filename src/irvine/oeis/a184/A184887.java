package irvine.oeis.a184;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A184887 a(n) = (8^n/n!^2) * Product_{k=0..n-1} (16k+3)*(16k+5).
 * @author Georg Fischer
 */
public class A184887 extends HolonomicRecurrence {

/* Derived by
binomin(A184887, 0, proc(n) 2^(11*n) * GAMMA(n+3/16) * GAMMA(n+5/16) / (GAMMA(n+1)^2 * GAMMA(3/16) * GAMMA(5/16))          end, 1);
binomin(A184889, 0, proc(n) 500^n * GAMMA(n+1/5) * GAMMA(n+3/10) / (GAMMA(n+1)^2 * GAMMA(1/5) * GAMMA(3/10))               end, 1);
binomin(A184891, 0, proc(n) 2^(2*n) * 5^(3*n) * GAMMA(n+1/10) * GAMMA(n+2/5) / (GAMMA(2/5) * GAMMA(1/10) * GAMMA(n+1)^2)   end, 1);
binomin(A184895, 0, proc(n) 2^(2*n) * 7^(3*n) * GAMMA(n+1/14) * GAMMA(n+3/7) / (GAMMA(3/7) * GAMMA(1/14) * GAMMA(n+1)^2)   end, 1);
binomin(A184897, 0, proc(n) 2^(11*n) * GAMMA(n+1/16) * GAMMA(n+7/16) / (GAMMA(n+1)^2 * GAMMA(1/16) * GAMMA(7/16))          end, 1);
*/

  /** Construct the sequence. */
  public A184887() {
    super(0, "[[0],[-1144, 3072,-2048],[0, 0, 1]]", "1", 0);
  }
}
