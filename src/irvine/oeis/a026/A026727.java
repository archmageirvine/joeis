package irvine.oeis.a026;

import irvine.oeis.LinearRecurrence;

/**
 * A026727.
 * @author Sean A. Irvine
 */
public class A026727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A026727() {
    super(new long[] {-1056, 932, -252, 27}, new long[] {1, 27, 477, 7007});
  }
}
