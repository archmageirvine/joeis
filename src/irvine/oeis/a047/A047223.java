package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047223.
 * @author Sean A. Irvine
 */
public class A047223 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047223() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 3, 6});
  }
}
