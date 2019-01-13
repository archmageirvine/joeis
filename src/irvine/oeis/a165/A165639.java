package irvine.oeis.a165;

import irvine.oeis.LinearRecurrence;

/**
 * A165639.
 * @author Sean A. Irvine
 */
public class A165639 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165639() {
    super(new long[] {7, -6}, new long[] {1, 7});
  }
}
