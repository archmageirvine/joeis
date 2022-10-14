package irvine.oeis.a073;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A073551 Number of Fibonacci numbers F(k), k &lt;= 10^n, which end in 3.
 * @author Georg Fischer
 */
public class A073551 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A073551() {
    super(1, "[[0],[-10],[11],[-1]", "2,12,132,1332", 0);
  }
}
