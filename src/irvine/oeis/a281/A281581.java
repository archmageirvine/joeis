package irvine.oeis.a281;

import irvine.oeis.LinearRecurrence;

/**
 * A281581.
 * @author Sean A. Irvine
 */
public class A281581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A281581() {
    super(new long[] {-240, 268, -104, 17}, new long[] {1, 4, 21, 127});
  }
}
