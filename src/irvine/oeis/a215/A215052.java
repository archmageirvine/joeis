package irvine.oeis.a215;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A215052 a(n) = (binomial(n, 5) - floor(n/5)) / 5.
 * Recurrence: -n*(n^2+2*n+17)*a(n) + (5*n^2+15*n+60)*(a(n-1) + a(n-2) + a(n-3) + a(n-4)) + (n+3)*(n^2+4*n+20)*a(n-5) = 0
 * @author Georg Fischer
 */
public class A215052 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A215052() {
    /*
      f:=gfun:-rectoproc({-n*(n^2+2*n+17)*a(n) + (5*n^2+15*n+60)*(a(n-1) + a(n-2) + a(n-3) + a(n-4)) 
          + (n+3)*(n^2+4*n+20)*a(n-5),a(0)=1,a(1)=4,a(2)=11,a(3)=25,a(4)=50,a(5)=92}, a(n), remember): map(f, [$0..20]);
    */
    super(6, "[[0],[60, 32, 7, 1],[60, 15, 5],[60, 15, 5],[60, 15, 5],[60, 15, 5],[0,-17,-2,-1]]", "1", 6);
  }
}
