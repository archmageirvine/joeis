package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139792 First quadrisection of <code>A139763 (1, 2, 3, 4, 11)</code>.
 * @author Sean A. Irvine
 */
public class A139792 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139792() {
    super(new long[] {-16, 17}, new long[] {1, 11});
  }
}
