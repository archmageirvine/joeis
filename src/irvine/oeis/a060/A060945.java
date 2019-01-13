package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060945.
 * @author Sean A. Irvine
 */
public class A060945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060945() {
    super(new long[] {1, 0, 1, 1}, new long[] {1, 1, 2, 3});
  }
}
