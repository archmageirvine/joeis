package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215404.
 * @author Sean A. Irvine
 */
public class A215404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215404() {
    super(new long[] {-1, -3, 4}, new long[] {0, 0, 1});
  }
}
