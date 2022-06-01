package irvine.oeis.a084;
// manually

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A084943 Decagorials: n-th polygorial for k=10.
 * @author Georg Fischer
 */
public class A084943 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A084943() {
    super(0, "[[0],[0, 6,-8],[2]]", "[1, 1]", 0);
  }
}
