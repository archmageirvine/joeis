package irvine.oeis.a053;
// manually 2021-05-23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A053987 Numerators of successive convergents to tan(1/2) using continued fraction 1/(2-1/(6-1/(10-1/(14-1/(18-1/(22-1/(26-1/30-...))))))).
 * @author Georg Fischer
 */
public class A053987 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A053987() {
    super(1, "[[0],[-1],[2, 4],[-1]", "1, 6, 59, 820, 14701", 1);
  }
}
