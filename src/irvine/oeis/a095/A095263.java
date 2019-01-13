package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095263.
 * @author Sean A. Irvine
 */
public class A095263 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095263() {
    super(new long[] {1, -2, 3}, new long[] {1, 3, 7});
  }
}
