package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215885.
 * @author Sean A. Irvine
 */
public class A215885 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215885() {
    super(new long[] {-1, 0, 3}, new long[] {3, 3, 9});
  }
}
