package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052971.
 * @author Sean A. Irvine
 */
public class A052971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052971() {
    super(new long[] {-2, 2, 0, 2}, new long[] {1, 1, 2, 6});
  }
}
