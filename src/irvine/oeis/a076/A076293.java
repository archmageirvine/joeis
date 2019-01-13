package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076293.
 * @author Sean A. Irvine
 */
public class A076293 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076293() {
    super(new long[] {-1, 0, 0, 6, 0, 0}, new long[] {1, 7, 17, 23, 49, 103});
  }
}
