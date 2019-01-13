package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254782.
 * @author Sean A. Irvine
 */
public class A254782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254782() {
    super(new long[] {1, -23, 23}, new long[] {1, 11, 231});
  }
}
