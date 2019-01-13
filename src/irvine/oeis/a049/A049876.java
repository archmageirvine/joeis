package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049876.
 * @author Sean A. Irvine
 */
public class A049876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049876() {
    super(new long[] {1, -1, 0, 2}, new long[] {2, 3, 4, 7});
  }
}
