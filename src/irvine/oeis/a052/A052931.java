package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052931.
 * @author Sean A. Irvine
 */
public class A052931 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052931() {
    super(new long[] {1, 3, 0}, new long[] {1, 0, 3});
  }
}
