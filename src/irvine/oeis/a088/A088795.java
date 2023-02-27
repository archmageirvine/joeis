package irvine.oeis.a088;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A088795 Fibonacci(n) as n runs through the quarter-squares.
 * @author Georg Fischer
 */
public class A088795 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A088795() {
    super(1, "[[0],[-1],[3],[-2],[-2],[3],[-1]]", "1,2,3,5", 0);
  }
}
