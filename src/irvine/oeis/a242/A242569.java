package irvine.oeis.a242;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A242569 a(n) = n! - 2*n.
 * @author Georg Fischer
 */
public class A242569 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A242569() {
    super(0, "[[0,-4, 2],[0, 1],[-1]]", "[1]", 0);
  }
}
