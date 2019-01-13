package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021544.
 * @author Sean A. Irvine
 */
public class A021544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021544() {
    super(new long[] {-168, 269, -119, 19}, new long[] {1, 19, 242, 2606});
  }
}
