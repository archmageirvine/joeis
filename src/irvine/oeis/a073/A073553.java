package irvine.oeis.a073;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A073553 Number of Fibonacci numbers F(k), k &lt;= 10^n, which end in 5.
 * G.f.: 2*x*(1 - 4*x)/((1 - x)*(1 - 10*x)).
 * @author Georg Fischer
 */
public class A073553 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A073553() {
    super(1, "[[0],[-10],[11],[-1]", "2, 14", 0);
  }
}
