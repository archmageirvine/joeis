package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252630.
 * @author Sean A. Irvine
 */
public class A252630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252630() {
    super(new long[] {1, -323, 323}, new long[] {50, 16503, 5314316});
  }
}
