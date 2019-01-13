package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047359.
 * @author Sean A. Irvine
 */
public class A047359 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047359() {
    super(new long[] {-1, 1, 0, 1}, new long[] {0, 2, 3, 7});
  }
}
