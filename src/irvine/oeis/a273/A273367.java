package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273367.
 * @author Sean A. Irvine
 */
public class A273367 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273367() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 3, 19, 25, 57});
  }
}
