package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021414.
 * @author Sean A. Irvine
 */
public class A021414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021414() {
    super(new long[] {-90, 153, -77, 15}, new long[] {1, 15, 148, 1218});
  }
}
