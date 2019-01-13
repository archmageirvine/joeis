package irvine.oeis.a282;

import irvine.oeis.LinearRecurrence;

/**
 * A282818.
 * @author Sean A. Irvine
 */
public class A282818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282818() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 2, 20, 110, 460});
  }
}
