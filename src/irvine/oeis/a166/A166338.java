package irvine.oeis.a166;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A166338 a(n) = (4*n)!/n!.
 * @author Georg Fischer
 */
public class A166338 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A166338() {
    super(0, "[[0],[-24, 176,-384, 256],[-1]]", "[1]", 0);
  }
}
