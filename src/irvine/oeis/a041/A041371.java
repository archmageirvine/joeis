package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041371.
 * @author Sean A. Irvine
 */
public class A041371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041371() {
    super(new long[] {-1, 0, 198, 0}, new long[] {1, 7, 197, 1386});
  }
}
