package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137693.
 * @author Sean A. Irvine
 */
public class A137693 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137693() {
    super(new long[] {1, -1155, 1155}, new long[] {7, 7887, 9101399});
  }
}
