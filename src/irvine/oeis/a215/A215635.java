package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215635.
 * @author Sean A. Irvine
 */
public class A215635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215635() {
    super(new long[] {-2, -36, -105, -112, -54, -12}, new long[] {3, -6, 18, -60, 210, -756});
  }
}
