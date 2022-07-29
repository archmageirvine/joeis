package irvine.oeis.a346;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A346224 a(n) = (n!)^2 * Sum_{k=0..floor(n/2)} 1 / ((n-2*k)! * 4^k * k!).
 * Recurrence: a(0) = a(1) = 1; a(n) = n * a(n-1) + n * (n-1)^2 * a(n-2) / 2.
 * @author Georg Fischer
 */
public class A346224 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A346224() {
    super(0, "[[0],[0, 1,-2, 1],[0, 2],[-2]", "1", 0);
  }
}
