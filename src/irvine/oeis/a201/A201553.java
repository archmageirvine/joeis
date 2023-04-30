package irvine.oeis.a201;
// manually verified, 2023-04-29

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A201553 Number of arrays of 6 integers in -n..n with sum zero.
 * @author Georg Fischer
 */
public class A201553 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A201553() {
    super(0, "[[0],[1],[-6],[15],[-20],[15],[-6],[1]]", "1,141,1751,9331,32661,88913,204763", 0);
  }
}
