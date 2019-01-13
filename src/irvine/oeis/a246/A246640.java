package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246640.
 * @author Sean A. Irvine
 */
public class A246640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246640() {
    super(new long[] {1, -4, 4}, new long[] {2, 3, 6});
  }
}
