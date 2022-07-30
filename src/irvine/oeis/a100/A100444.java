package irvine.oeis.a100;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A100444 Bisection of A000255.
 * Reecurrence: a(n) +(-4*n^2-2*n+1)*a(n-1) +2*n*(2*n-3)*a(n-2)=0.
 * @author Georg Fischer
 */
public class A100444 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A100444() {
    super(0, "[[0],[0,-6, 4],[1,-2,-4],[1]", "[1, 3]", 0);
  }
}
