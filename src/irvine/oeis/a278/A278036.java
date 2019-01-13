package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278036.
 * @author Sean A. Irvine
 */
public class A278036 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278036() {
    super(new long[] {2048, -2304, 640, 144, -104, 18}, new long[] {4, 40, 416, 3808, 33472, 282752});
  }
}
