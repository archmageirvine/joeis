package irvine.oeis.a089;

import irvine.oeis.LinearRecurrence;

/**
 * A089508.
 * @author Sean A. Irvine
 */
public class A089508 extends LinearRecurrence {

  /** Construct the sequence. */
  public A089508() {
    super(new long[] {1, -8, 8}, new long[] {1, 14, 103});
  }
}
