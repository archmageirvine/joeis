package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215144.
 * @author Sean A. Irvine
 */
public class A215144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215144() {
    super(new long[] {-1, 2}, new long[] {1, 20});
  }
}
