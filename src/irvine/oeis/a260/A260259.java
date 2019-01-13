package irvine.oeis.a260;

import irvine.oeis.LinearRecurrence;

/**
 * A260259.
 * @author Sean A. Irvine
 */
public class A260259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A260259() {
    super(new long[] {-1, 2, 2}, new long[] {-1, 2, 1});
  }
}
