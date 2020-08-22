package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139760 First quadrisection of A115451.
 * @author Sean A. Irvine
 */
public class A139760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139760() {
    super(new long[] {-16, 17}, new long[] {1, 9});
  }
}
