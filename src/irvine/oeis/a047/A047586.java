package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047586.
 * @author Sean A. Irvine
 */
public class A047586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047586() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {2, 3, 5, 6, 7, 10});
  }
}
