package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047293.
 * @author Sean A. Irvine
 */
public class A047293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047293() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 2, 4, 6, 7});
  }
}
