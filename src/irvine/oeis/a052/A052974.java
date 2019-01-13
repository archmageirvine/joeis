package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052974.
 * @author Sean A. Irvine
 */
public class A052974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052974() {
    super(new long[] {-2, 1, 1, 2}, new long[] {1, 0, 1, 3});
  }
}
