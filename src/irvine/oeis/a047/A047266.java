package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047266.
 * @author Sean A. Irvine
 */
public class A047266 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047266() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 1, 5, 6});
  }
}
