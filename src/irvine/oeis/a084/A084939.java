package irvine.oeis.a084;
// manually

import irvine.oeis.HolonomicRecurrence;

/**
 * A084939 Pentagorials: n-th polygorial for k=5.
 * @author Georg Fischer
 */
public class A084939 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A084939() {
    super(0, "[[0],[0, 1,-3],[2]]", "[1, 1]", 0);
  }
}
