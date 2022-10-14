package irvine.oeis.a073;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A073555 Number of Fibonacci numbers F(k), k &lt;= 10^n, which end in 8.
 * @author Georg Fischer
 */
public class A073555 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A073555() {
    super(1, "[[0],[-10],[11],[-1]", "1,8,68,668", 0);
  }
}
