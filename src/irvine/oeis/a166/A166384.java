package irvine.oeis.a166;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A166384 a(n) = (5*n)!/(2*n)!.
 * @author Georg Fischer
 */
public class A166384 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A166384() {
    super(0, "[[0],[120,-1250, 4375,-6250, 3125],[2,-4]]", "[1]", 0);
  }
}
