package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220212.
 * @author Sean A. Irvine
 */
public class A220212 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220212() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 16, 70, 200});
  }
}
