package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215139.
 * @author Sean A. Irvine
 */
public class A215139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215139() {
    super(new long[] {7, 0, -14, 0, 7, 0}, new long[] {5, 4, 22, 17, 91, 69});
  }
}
