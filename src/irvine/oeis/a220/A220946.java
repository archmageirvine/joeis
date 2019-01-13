package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220946.
 * @author Sean A. Irvine
 */
public class A220946 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220946() {
    super(new long[] {-3, 0, 4, 0}, new long[] {1, 2, 6, 7});
  }
}
