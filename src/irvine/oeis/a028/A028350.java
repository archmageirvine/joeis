package irvine.oeis.a028;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A028350 Expansion of -1/x + 6*3F2( 5/6, 1, 7/6; 3/2, 2; 108*x).
 * Recurrence: (n+1)*(2*n+1)*a(n) -6*(6*n-1)*(6*n+1)*a(n-1)=0.
 * @author Georg Fischer
 */
public class A028350 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A028350() {
    super(-1, "[[0],[6, 0,-216],[1, 3, 2]", "-1", 0);
  }
}
