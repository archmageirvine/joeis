package irvine.oeis.a229;

import irvine.oeis.LinearRecurrence;

/**
 * A229593.
 * @author Sean A. Irvine
 */
public class A229593 extends LinearRecurrence {

  /** Construct the sequence. */
  public A229593() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {0, 2, 3, 4, 10, 12, 14});
  }
}
