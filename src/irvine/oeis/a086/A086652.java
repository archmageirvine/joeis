package irvine.oeis.a086;

import irvine.oeis.LinearRecurrence;

/**
 * A086652.
 * @author Sean A. Irvine
 */
public class A086652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A086652() {
    super(new long[] {-4, 2, 2}, new long[] {6, 13, 28});
  }
}
