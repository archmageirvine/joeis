package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215455.
 * @author Sean A. Irvine
 */
public class A215455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215455() {
    super(new long[] {1, -9, 6}, new long[] {3, 6, 18});
  }
}
