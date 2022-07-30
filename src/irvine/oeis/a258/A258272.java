package irvine.oeis.a258;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A258272 The smallest amount which cannot be made with fewer than n British coins.
 * @author Georg Fischer
 */
public class A258272 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A258272() {
    super(1, "[[0],[303,-50],[-353, 50]]", "1, 3, 8, 18, 38, 88, 188", 0);
  }
}
