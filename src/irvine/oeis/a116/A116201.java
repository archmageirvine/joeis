package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116201.
 * @author Sean A. Irvine
 */
public class A116201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116201() {
    super(new long[] {-1, 1, 1, 1}, new long[] {0, 1, 1, 1});
  }
}
