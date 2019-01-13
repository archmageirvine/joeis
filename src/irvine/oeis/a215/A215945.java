package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215945.
 * @author Sean A. Irvine
 */
public class A215945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215945() {
    super(new long[] {3, -27, 33}, new long[] {-3, -105, -3387});
  }
}
