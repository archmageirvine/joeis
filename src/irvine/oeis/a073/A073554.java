package irvine.oeis.a073;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A073554 Number of Fibonacci numbers F(k), k &lt;= 10^n, which end in 7.
 * @author Georg Fischer
 */
public class A073554 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A073554() {
    super(1, "[[0],[-10],[11],[-1]", "0,14,134,1334", 0);
  }
}
