package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041057.
 * @author Sean A. Irvine
 */
public class A041057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041057() {
    super(new long[] {-1, 0, 0, 0, 70, 0, 0, 0}, new long[] {1, 1, 5, 6, 65, 71, 349, 420});
  }
}
