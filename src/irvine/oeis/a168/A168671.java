package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168671.
 * @author Sean A. Irvine
 */
public class A168671 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168671() {
    super(new long[] {-1, 1, 1}, new long[] {1, 10, 14});
  }
}
