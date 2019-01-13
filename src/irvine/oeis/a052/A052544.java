package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052544.
 * @author Sean A. Irvine
 */
public class A052544 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052544() {
    super(new long[] {1, -3, 4}, new long[] {1, 2, 6});
  }
}
