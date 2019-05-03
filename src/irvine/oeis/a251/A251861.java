package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251861 Number of non-palindromic words <code>(length n&gt;0)</code> over the alphabet of 26 letters.
 * @author Sean A. Irvine
 */
public class A251861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251861() {
    super(new long[] {-676, 26, 26}, new long[] {0, 650, 16900});
  }
}
