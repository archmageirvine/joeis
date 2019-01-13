package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162746.
 * @author Sean A. Irvine
 */
public class A162746 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162746() {
    super(new long[] {-11, 28, -23, 8}, new long[] {1, 2, 5, 14});
  }
}
