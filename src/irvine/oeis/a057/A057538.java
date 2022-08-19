package irvine.oeis.a057;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A057538 Birthday set of order 5: numbers congruent to +-1 modulo 2, 3, 4 and 5.
 * @author Georg Fischer
 */
public class A057538 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A057538() {
    super(1, "[0, 1,-1, 0, 0,-1, 1]", "[1, 11, 19, 29, 31, 41]", 0);
  }
}
