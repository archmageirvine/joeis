package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078757 Values of <code>A028470(n)/A000045(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A078757 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078757() {
    super(new long[] {-1, -1, 25, -11, -47, 11, 25, 1}, new long[] {1, 17, 51, 449, 1853, 12853, 61557, 382024});
  }
}
