package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215794.
 * @author Sean A. Irvine
 */
public class A215794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215794() {
    super(new long[] {7, -35, 21}, new long[] {-1, -31, -609});
  }
}
