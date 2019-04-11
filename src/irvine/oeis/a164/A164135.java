package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164135 Numbers k such that <code>k^2 == 2 (mod 47)</code>.
 * @author Sean A. Irvine
 */
public class A164135 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164135() {
    super(new long[] {-1, 1, 1}, new long[] {7, 40, 54});
  }
}
