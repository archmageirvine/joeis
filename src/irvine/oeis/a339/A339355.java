package irvine.oeis.a339;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A339355 Maximum number of copies of a 12345 permutation pattern in an alternating (or zig-zag) permutation of length n + 7.
 * Recurrence: (n-1)*((n-3)^2+9*n-6)*a(n) - (2*(n-3)^2+20*n-16)*a(n-1) - (n+5)*((n-3)^2+11*n-2)*a(n-2) = 0
 * @author Georg Fischer
 */
public class A339355 extends HolonomicRecurrence {

  /* Maple:
    a := proc(n2) local n; n:= floor(n2 / 2): if n2 = 2*n then 32*binomial(n+4,5) - 16*binomial(n+3,4) 
    else n := n + 1; (4*n*(n^4 + 5*n^3 + 10*n^2 + 10*n + 4))/15 fi end;
    seq(print(n,a(n)), n=0..20);
  */

  /** Construct the sequence. */
  public A339355() {
    super(1, "[[0],[35,32,10,1],[2,8,2],[3,0,-2,-1]]", "8", 0);
  }
}


