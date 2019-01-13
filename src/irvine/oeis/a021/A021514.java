package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021514.
 * @author Sean A. Irvine
 */
public class A021514 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021514() {
    super(new long[] {-180, 288, -127, 20}, new long[] {1, 20, 273, 3208});
  }
}
