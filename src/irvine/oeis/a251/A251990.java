package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251990.
 * @author Sean A. Irvine
 */
public class A251990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251990() {
    super(new long[] {1, -195, 195}, new long[] {52, 10136, 1966380});
  }
}
