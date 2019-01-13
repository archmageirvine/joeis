package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016205.
 * @author Sean A. Irvine
 */
public class A016205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016205() {
    super(new long[] {20, -32, 13}, new long[] {1, 13, 137});
  }
}
