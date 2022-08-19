package irvine.oeis.a000;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A000597 Central factorial numbers.
 * @author Georg Fischer
 */
public class A000597 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A000597() {
    super(4, "[0, 1,-10, 45,-120, 210,-252, 210,-120, 45,-10, 1]", "[36, 820, 7645, 44473, 191620, 669188]");
  }
}
