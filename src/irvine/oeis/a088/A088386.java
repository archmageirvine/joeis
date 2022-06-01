package irvine.oeis.a088;
// manually 2021-05-23

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A088386 a(n) = 2^n*(n!)^3.
 * @author Georg Fischer
 */
public class A088386 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A088386() {
    super(0, "[[0],[0, 0, 0, 2],[-1]", "1", 0);
  }
}
