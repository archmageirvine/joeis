package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016262.
 * @author Sean A. Irvine
 */
public class A016262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016262() {
    super(new long[] {99, -119, 21}, new long[] {1, 21, 322});
  }
}
