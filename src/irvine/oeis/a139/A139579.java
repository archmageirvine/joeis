package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139579.
 * @author Sean A. Irvine
 */
public class A139579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139579() {
    super(new long[] {1, -3, 3}, new long[] {0, 17, 38});
  }
}
