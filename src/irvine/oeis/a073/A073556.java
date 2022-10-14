package irvine.oeis.a073;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A073556 Number of Fibonacci numbers F(k), k &lt;= 10^n, which end in 9.
 * @author Georg Fischer
 */
public class A073556 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A073556() {
    super(1, "[[0],[-10],[11],[-1]", "0,13,133", 0);
  }
}
