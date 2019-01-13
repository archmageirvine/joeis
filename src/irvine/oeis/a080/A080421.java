package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080421.
 * @author Sean A. Irvine
 */
public class A080421 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080421() {
    super(new long[] {-81, 108, -54, 12}, new long[] {1, 10, 66, 360});
  }
}
