package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052538.
 * @author Sean A. Irvine
 */
public class A052538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052538() {
    super(new long[] {-3, 3, 2}, new long[] {1, 1, 5});
  }
}
