package irvine.oeis.a006;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A006223 Number of binary rooted trees of height n requiring 3 registers.
 * @author Georg Fischer
 */
public class A006223 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A006223() {
    super(7, "[0,-8, 84,-252, 330,-220, 78,-14, 1]", "1", 0);
  }
}
