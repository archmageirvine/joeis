package irvine.oeis.a251;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A251861 Number of non-palindromic words (length n&gt;0) over the alphabet of 26 letters.
 * @author Sean A. Irvine
 */
public class A251861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251861() {
    super(1, new long[] {-676, 26, 26}, new long[] {0, 650, 16900});
  }
}
