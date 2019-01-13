package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052946.
 * @author Sean A. Irvine
 */
public class A052946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052946() {
    super(new long[] {1, -2, 0, 3}, new long[] {1, 1, 4, 10});
  }
}
