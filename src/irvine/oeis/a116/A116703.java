package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116703.
 * @author Sean A. Irvine
 */
public class A116703 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116703() {
    super(new long[] {3, -5, 4}, new long[] {1, 2, 5});
  }
}
