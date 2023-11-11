package irvine.oeis.a143;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A143414 Apéry-like numbers for the constant 1/e: a(n) = (1/(n-1)!)*Sum_{k = 0..n-1} binomial(n-1,k)*(2*n-k)!.
 * @author Georg Fischer
 */
public class A143414 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143414() {
    // Recurrence relation: a(0) = 0, a(1) = 2, (n-1)^2*a(n) - n^2*a(n-2) - (4*n^3-6*n^2+4*n-1)*a(n-1), n >= 2.  
    super(0, "[[0],[0,0,-1],[1,-4,6,-4],[1,-2,1]]", "0,2", 0);
  }
}
