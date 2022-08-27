package irvine.oeis.a123;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A123251 Continued fraction for sqrt(2)*tan(1/sqrt(2)).
 * @author Georg Fischer
 */
public class A123251 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A123251() {
    super(1, "[[0],[-1],[0],[0],[0],[2],[0],[0],[0],[-1]]", "1, 4, 1, 3, 1, 12, 1, 7", 0);
  }
}
