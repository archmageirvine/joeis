package irvine.oeis.a351;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A351930 Expansion of e.g.f. exp(x - x^4/24).
 * @author Georg Fischer
 */
public class A351930 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A351930() {
    super(0, "[[0],[6,-11, 6,-1],[0],[0],[6],[-6]", "1", 0);
  }
}
