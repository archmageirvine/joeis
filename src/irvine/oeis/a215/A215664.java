package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215664.
 * @author Sean A. Irvine
 */
public class A215664 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215664() {
    super(new long[] {-1, 3, 0}, new long[] {3, 0, 6});
  }
}
