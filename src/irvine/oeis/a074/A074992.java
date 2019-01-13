package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074992.
 * @author Sean A. Irvine
 */
public class A074992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074992() {
    super(new long[] {1000, -1110, 111}, new long[] {1, 37, 3367});
  }
}
