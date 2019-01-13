package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162563.
 * @author Sean A. Irvine
 */
public class A162563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162563() {
    super(new long[] {-1, 4}, new long[] {5, 13});
  }
}
