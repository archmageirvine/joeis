package irvine.oeis.a239;

import irvine.oeis.LinearRecurrence;

/**
 * A239352.
 * @author Sean A. Irvine
 */
public class A239352 extends LinearRecurrence {

  /** Construct the sequence. */
  public A239352() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 1, 12, 48});
  }
}
