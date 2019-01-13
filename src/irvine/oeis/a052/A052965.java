package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052965.
 * @author Sean A. Irvine
 */
public class A052965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052965() {
    super(new long[] {-4, 4, 3}, new long[] {1, 2, 10});
  }
}
