package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137234.
 * @author Sean A. Irvine
 */
public class A137234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137234() {
    super(new long[] {1, -4, 8, -9, 5}, new long[] {1, 5, 16, 43, 107});
  }
}
