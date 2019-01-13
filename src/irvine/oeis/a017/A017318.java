package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017318.
 * @author Sean A. Irvine
 */
public class A017318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017318() {
    super(new long[] {1, -3, 3}, new long[] {16, 196, 576});
  }
}
