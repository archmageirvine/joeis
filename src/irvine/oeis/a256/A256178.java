package irvine.oeis.a256;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A256178 Expansion of exp( Sum_{n &gt;= 1} L(2*n)*L(4*n)*x^n/n ), where L(n) = A000032(n) is a Lucas number.
 * @author Georg Fischer
 */
public class A256178 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A256178() {
    super(0, "[[0],[-1],[21],[-56],[21],[-1]]", "1", 0);
  }
}
