package irvine.oeis.a104;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A104629 Expansion of (1-2*x-sqrt(1-4*x))/(x^2 * (1+2*x+sqrt(1-4*x))).
 * Recurrence: (7*n+9)*n*a(n-1)+2*(2*n+3)*n*a(n-2)-2*(n+3)*n*a(n) = 0.
 * @author Georg Fischer
 */
public class A104629 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A104629() {
    super(0, "[[0],[0,6,4],[0,9,7],[0,-6,-2]]", "1", 0);
  }
}
