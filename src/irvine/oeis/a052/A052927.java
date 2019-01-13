package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052927.
 * @author Sean A. Irvine
 */
public class A052927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052927() {
    super(new long[] {1, 0, 4}, new long[] {1, 4, 16});
  }
}
