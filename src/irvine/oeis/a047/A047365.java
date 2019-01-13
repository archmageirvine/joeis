package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047365.
 * @author Sean A. Irvine
 */
public class A047365 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047365() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 3, 4, 5, 7});
  }
}
