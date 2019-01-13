package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047236.
 * @author Sean A. Irvine
 */
public class A047236 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047236() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 2, 4, 7});
  }
}
