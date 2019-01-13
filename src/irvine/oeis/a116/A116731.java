package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116731.
 * @author Sean A. Irvine
 */
public class A116731 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116731() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 5, 12});
  }
}
