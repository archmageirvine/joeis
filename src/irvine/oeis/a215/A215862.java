package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215862.
 * @author Sean A. Irvine
 */
public class A215862 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215862() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 4, 19, 55, 125});
  }
}
