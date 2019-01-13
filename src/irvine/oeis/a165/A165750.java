package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165750.
 * @author Sean A. Irvine
 */
public class A165750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165750() {
    super(new long[] {10, -9}, new long[] {1, 10});
  }
}
