package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047418.
 * @author Sean A. Irvine
 */
public class A047418 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047418() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 2, 3, 4, 6, 8});
  }
}
