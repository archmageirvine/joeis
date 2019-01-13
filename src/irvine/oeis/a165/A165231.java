package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165231.
 * @author Sean A. Irvine
 */
public class A165231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165231() {
    super(new long[] {-8, 16}, new long[] {1, 8});
  }
}
