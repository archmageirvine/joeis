package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047377.
 * @author Sean A. Irvine
 */
public class A047377 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047377() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {0, 1, 4, 5, 7});
  }
}
