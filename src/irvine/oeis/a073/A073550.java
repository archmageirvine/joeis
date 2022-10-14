package irvine.oeis.a073;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A073550 Number of Fibonacci numbers F(k), k &lt;= 10^n, which end in 1.
 * @author Georg Fischer
 */
public class A073550 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A073550() {
    super(1, "[[0],[-10],[11],[-1]", "3,14,134,1334", 0);
  }
}
