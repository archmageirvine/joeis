package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033592.
 * @author Sean A. Irvine
 */
public class A033592 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033592() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 360, 3465, 14560, 41769});
  }
}
