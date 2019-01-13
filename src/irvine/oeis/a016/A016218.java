package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016218.
 * @author Sean A. Irvine
 */
public class A016218 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016218() {
    super(new long[] {20, -29, 10}, new long[] {1, 10, 71});
  }
}
