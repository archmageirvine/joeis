package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116164.
 * @author Sean A. Irvine
 */
public class A116164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116164() {
    super(new long[] {216, -108, 18}, new long[] {0, 12, 216});
  }
}
