package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041511.
 * @author Sean A. Irvine
 */
public class A041511 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041511() {
    super(new long[] {-1, 0, 66, 0}, new long[] {1, 2, 65, 132});
  }
}
