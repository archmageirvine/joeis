package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047345.
 * @author Sean A. Irvine
 */
public class A047345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047345() {
    super(new long[] {-1, 1, 1}, new long[] {0, 4, 7});
  }
}
