package irvine.oeis.a076;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A076035 G.f.: 1/(1-4*x*C) where C = (1/2-1/2*(1-4*x)^(1/2))/x = g.f. for Catalan numbers A000108.
 * Recurrence: 3*n*a(n) +2*(9-14*n)*a(n-1) +32*(2*n-3)*a(n-2) = 0.
 * @author Georg Fischer
 */
public class A076035 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A076035() {
    super(0, "[[0],[-96, 64],[18,-28],[0, 3]", "1, 4", 0);
  }
}
