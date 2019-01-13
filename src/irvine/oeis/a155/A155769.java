package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155769.
 * @author Sean A. Irvine
 */
public class A155769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155769() {
    super(new long[] {1, -3, 3}, new long[] {-41, -37, -29});
  }
}
