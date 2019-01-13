package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024145.
 * @author Sean A. Irvine
 */
public class A024145 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024145() {
    super(new long[] {12, -73, 186, -255, 200, -87, 18}, new long[] {1, 11, 112, 1485, 19712, 245707, 2978208});
  }
}
