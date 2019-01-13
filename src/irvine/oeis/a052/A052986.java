package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052986.
 * @author Sean A. Irvine
 */
public class A052986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052986() {
    super(new long[] {-2, -1, 4}, new long[] {1, 2, 7});
  }
}
