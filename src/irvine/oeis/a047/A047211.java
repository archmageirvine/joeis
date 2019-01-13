package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047211.
 * @author Sean A. Irvine
 */
public class A047211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047211() {
    super(new long[] {-1, 1, 1}, new long[] {2, 4, 7});
  }
}
