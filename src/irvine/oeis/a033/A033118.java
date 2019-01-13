package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033118.
 * @author Sean A. Irvine
 */
public class A033118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033118() {
    super(new long[] {-8, 1, 8}, new long[] {1, 8, 65});
  }
}
