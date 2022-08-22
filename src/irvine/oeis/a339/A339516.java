package irvine.oeis.a339;
// manually 2022-08-22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A339516 a(n+1) = (a(n) - 2*(n-1)) * (2*n-1), where a(1)=1.
 * Recurrence: -a(n+1)+(2*n-1)*a(n)-4*n^2+6*n-2=0.
 * @author Georg Fischer
 */
public class A339516 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A339516() {
    super(1, "[[-2, 6,-4],[-1, 2],[-1]", "1", 1);
  }
}
